package br.edu.fema.modelo.atividadesfixacao.atividades.service.impl;

import br.edu.fema.modelo.atividadesfixacao.atividades.DTO.TipoAlimentoDTO;
import br.edu.fema.modelo.atividadesfixacao.atividades.forms.TipoAlimentoForm;
import br.edu.fema.modelo.atividadesfixacao.atividades.models.entities.tipoAlimento.TipoAlimento;
import br.edu.fema.modelo.atividadesfixacao.atividades.models.repository.TipoAlimentoRepository;
import br.edu.fema.modelo.atividadesfixacao.atividades.service.TipoAlimentoService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TipoAlimentoServiceImpl implements TipoAlimentoService {

    private final TipoAlimentoRepository tipoAlimentoRepository;

    @Override
    public List<TipoAlimentoDTO> buscarTodosTipoAlimento() {
        List<TipoAlimento> listaTipoAlimentos = this.tipoAlimentoRepository.findAll();
        if(listaTipoAlimentos.isEmpty()) throw new ResponseStatusException(HttpStatus.NOT_FOUND
                ,"lista de tipo alimentos está vazia");
        return TipoAlimentoDTO.converter(listaTipoAlimentos);
    }

    @Override
    @Transactional
    public void criaTipoALimento(TipoAlimentoForm tipoAlimentoForm) {
        TipoAlimento tipoAlimentoCriado = new TipoAlimento();
            tipoAlimentoCriado.setDescricao(tipoAlimentoForm.getDescricao());
        this.tipoAlimentoRepository.save(tipoAlimentoCriado);
    }

    @Override
    public void atualizarTipoAlimento(TipoAlimentoForm tipoAlimentoForm, Long id) {
        Optional<TipoAlimento> tipoAlimentoEncontrado = this.tipoAlimentoRepository.findById(id);
        if(tipoAlimentoEncontrado.isEmpty()) throw new RuntimeException("Esse tipo de alimento não foi encontrado");
        this.tipoAlimentoRepository.save(converterForm(tipoAlimentoForm, id));
    }

    public TipoAlimento converterForm(TipoAlimentoForm converteForm, Long id){
        TipoAlimento tipoAlimento = new TipoAlimento();
        tipoAlimento.setId(id);
        tipoAlimento.setDescricao(converteForm.getDescricao());
        return tipoAlimento;
    }

    @Override
    public void deletarTipoAlimentoPeloId(Long id) {
        this.tipoAlimentoRepository.deleteById(id);
    }
}
