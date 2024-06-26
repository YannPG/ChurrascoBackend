package br.edu.fema.modelo.atividadesfixacao.atividades.service.impl;

import br.edu.fema.modelo.atividadesfixacao.atividades.DTO.TipoAlimentoDTO;
import br.edu.fema.modelo.atividadesfixacao.atividades.forms.AlimentoForm;
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
import java.util.UUID;

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
            tipoAlimentoCriado.setId(11l);
            tipoAlimentoCriado.setDescricao(tipoAlimentoForm.getDescricao());
        this.tipoAlimentoRepository.save(tipoAlimentoCriado);
    }

    @Override
    public void atualizarTipoAlimento(TipoAlimentoForm tipoAlimentoForm, UUID id) {

    }

    @Override
    public void deletarTipoAlimentoPeloId(UUID id) {

    }
}
