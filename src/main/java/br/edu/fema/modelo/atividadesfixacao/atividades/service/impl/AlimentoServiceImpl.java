package br.edu.fema.modelo.atividadesfixacao.atividades.service.impl;

import br.edu.fema.modelo.atividadesfixacao.atividades.DTO.AlimentoDTO;
import br.edu.fema.modelo.atividadesfixacao.atividades.forms.AlimentoForm;
import br.edu.fema.modelo.atividadesfixacao.atividades.models.entities.tipoAlimento.Alimento;
import br.edu.fema.modelo.atividadesfixacao.atividades.models.repository.AlimentoRepository;
import br.edu.fema.modelo.atividadesfixacao.atividades.models.repository.TipoAlimentoRepository;
import br.edu.fema.modelo.atividadesfixacao.atividades.service.AlimentoService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class AlimentoServiceImpl implements AlimentoService {

    private final AlimentoRepository alimentoRepository;
    private final TipoAlimentoRepository tipoAlimentoRepository;

    @Override
    public List<AlimentoDTO> buscarTodoAlimento() {
        List<Alimento> listaDeAlimentos = this.alimentoRepository.findAll();
        if(listaDeAlimentos.isEmpty()) throw new ResponseStatusException(HttpStatus.NOT_FOUND
                ,"lista de alimentos está vazia");
        return AlimentoDTO.converter(listaDeAlimentos);
    }

    @Override
    @Transactional
    public void criarAlimento(AlimentoForm alimentoForm) {
        Alimento alimentoCriado = new Alimento();

        alimentoCriado.setDescricao(alimentoForm.getDescricao());
        alimentoCriado.setValor(alimentoForm.getValorAlimento());
        alimentoCriado.setIdTipoAlimento(alimentoForm.getIdTipoAlimento());
        alimentoCriado.setTipoAlimento( this.tipoAlimentoRepository
                .findById(alimentoForm.getIdTipoAlimento()).get());

        this.alimentoRepository.save(alimentoCriado);
    }

    @Override
    public void atualizarAlimento(AlimentoForm alimentoForm, UUID id) {
        Optional<Alimento> alimentoEncontrado = alimentoRepository.findById(id);
        if(alimentoEncontrado.isEmpty()) throw new RuntimeException("esse Alimento não existe");
        alimentoRepository.save(converterForm(alimentoForm, id));
    }

    public Alimento converterForm(AlimentoForm convertForm, UUID id){
        Alimento alimento = new Alimento();
        alimento.setId(id);
        alimento.setDescricao(convertForm.getDescricao());
        alimento.setValor(convertForm.getValorAlimento());
        alimento.setIdTipoAlimento(convertForm.getIdTipoAlimento());
        alimento.setTipoAlimento(tipoAlimentoRepository
                        .findById(convertForm.getIdTipoAlimento())
                        .orElseThrow(() -> new ResponseStatusException(
                                HttpStatus.NOT_FOUND, "Tipo alimento não encontrado!")));
        return alimento;
    }

    public void deletarAlimentoPeloId(UUID id){

    }
}
