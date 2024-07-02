package br.edu.fema.modelo.atividadesfixacao.atividades.service;

import br.edu.fema.modelo.atividadesfixacao.atividades.DTO.LugarDTO;
import br.edu.fema.modelo.atividadesfixacao.atividades.forms.LugarForm;

import java.util.List;
import java.util.UUID;

public interface LugarService {
    List<LugarDTO> buscarTodoLugar();

    void criarLugar(LugarForm lugarForm, UUID id);
}
