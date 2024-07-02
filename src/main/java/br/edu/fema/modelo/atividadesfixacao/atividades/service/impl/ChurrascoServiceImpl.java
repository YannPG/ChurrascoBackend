package br.edu.fema.modelo.atividadesfixacao.atividades.service.impl;

import br.edu.fema.modelo.atividadesfixacao.atividades.forms.ChurrascoForm;
import br.edu.fema.modelo.atividadesfixacao.atividades.models.entities.churrasco.Churrasco;
import br.edu.fema.modelo.atividadesfixacao.atividades.models.repository.AlimentoRepository;
import br.edu.fema.modelo.atividadesfixacao.atividades.models.repository.ChurrascoRepository;
import br.edu.fema.modelo.atividadesfixacao.atividades.service.ChurrascoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ChurrascoServiceImpl implements ChurrascoService {

    private final ChurrascoRepository churrascoRepository;
    private final AlimentoRepository alimentoRepository;

    @Override
    public List<Churrasco> buscarTodosChurrascos() {
        List<Churrasco> listaDeChurrascos = this.churrascoRepository.findAll();
        if(listaDeChurrascos.isEmpty()) throw new ResponseStatusException(HttpStatus.NOT_FOUND
                ,"lista de alimentos está vazia");
        return listaDeChurrascos;
    }

    @Override
    public void criarChurrasco(ChurrascoForm churrascoForm, Long id){
        Churrasco churrascoCriado = new Churrasco();
        churrascoCriado.setId(id);
        churrascoCriado.setIdLugar(churrascoForm.getIdLugar());
        churrascoCriado.setIdAnfitriao(churrascoForm.getAnfitriao());
        churrascoCriado.setDataFim(LocalDateTime.parse(churrascoForm.getDataFim()));
        churrascoCriado.setDataInicio(LocalDateTime.parse(churrascoForm.getDataInicio()));
        this.churrascoRepository.save(churrascoCriado);
    }

    @Override
    public void atualizarChurrasco(ChurrascoForm churrascoForm, Long id){
        Optional<Churrasco> churrascoEncontrado = this.churrascoRepository.findById(id);
        if(churrascoEncontrado.isEmpty()) throw new RuntimeException("Esse churrasco não existe");
        this.churrascoRepository.save(converterForm(churrascoForm, id));
    }

    public Churrasco converterForm (ChurrascoForm churrascoForm, Long id){
        Churrasco churrascoAtualizado = new Churrasco();
        churrascoAtualizado.setId(id);
        churrascoAtualizado.setIdLugar(churrascoForm.getIdLugar());
        churrascoAtualizado.setDataInicio(LocalDateTime.parse(churrascoForm.getDataInicio()));
        churrascoAtualizado.setDataFim(LocalDateTime.parse(churrascoForm.getDataFim()));
        churrascoAtualizado.setIdAnfitriao(churrascoForm.getAnfitriao());
        return churrascoAtualizado;
    }

    @Override
    public void deletarChurrasco (Long id){
        this.churrascoRepository.deleteById(id);
    }

    @Override
    public List<Churrasco> buscarChurrascoPorData(String dataBusca){
        return this.churrascoRepository.findByDataInicioGreaterThanEqual(LocalDateTime
                .parse(dataBusca, DateTimeFormatter
                        .ofPattern("uuuu-MM-dd HH:mm:ss")));
    }

    @Override
    public List<Churrasco> buscarChurrascoEntreData(String dataBusca, String dataBusca2){
        return this.churrascoRepository.findAllByDataInicioGreaterThanEqualAndAndDataInicioLessThanEqual(
                LocalDateTime
                        .parse(dataBusca, DateTimeFormatter.ofPattern("uuuu-MM-dd HH:mm:ss")),
                LocalDateTime
                        .parse(dataBusca2, DateTimeFormatter.ofPattern("uuuu-MM-dd HH:mm:ss")));
    }
}
