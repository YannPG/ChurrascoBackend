package br.edu.fema.modelo.atividadesfixacao.atividades.service;

import br.edu.fema.modelo.atividadesfixacao.atividades.DTO.TipoAlimentoDTO;
import br.edu.fema.modelo.atividadesfixacao.atividades.forms.AlimentoForm;
import br.edu.fema.modelo.atividadesfixacao.atividades.forms.TipoAlimentoForm;

import java.util.List;
import java.util.UUID;

public interface TipoAlimentoService {

    List<TipoAlimentoDTO> buscarTodosTipoAlimento();

    void criaTipoALimento(TipoAlimentoForm tipoAlimentoForm);

    void atualizarTipoAlimento(TipoAlimentoForm tipoAlimentoForm, UUID id);

    void deletarTipoAlimentoPeloId(UUID id);
}
