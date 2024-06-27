package br.edu.fema.modelo.atividadesfixacao.atividades.forms;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;

@Getter
public class TipoAlimentoForm {

    @NotNull(message = "Campo descrição não pode ser nulo")
    private String descricao;

}
