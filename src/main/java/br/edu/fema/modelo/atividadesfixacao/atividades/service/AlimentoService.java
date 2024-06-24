package br.edu.fema.modelo.atividadesfixacao.atividades.service;

import br.edu.fema.modelo.atividadesfixacao.atividades.DTO.AlimentoDTO;
import br.edu.fema.modelo.atividadesfixacao.atividades.forms.AlimentoForm;

import java.util.List;
import java.util.UUID;

public interface AlimentoService {

    List<AlimentoDTO> buscarTodoAlimento();

    void criarAlimento(AlimentoForm alimentoForm);

    void atualizarAlimento(AlimentoForm alimentoForm, UUID id);

    void deletarAlimentoPeloId(UUID id);
}
