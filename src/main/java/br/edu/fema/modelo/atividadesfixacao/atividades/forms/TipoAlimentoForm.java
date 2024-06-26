package br.edu.fema.modelo.atividadesfixacao.atividades.forms;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter
public class TipoAlimentoForm {

    @NotNull(message = "Campo descrição não pode ser nulo")
    private String descricao;

}
