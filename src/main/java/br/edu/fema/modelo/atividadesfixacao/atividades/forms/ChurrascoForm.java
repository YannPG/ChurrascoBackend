package br.edu.fema.modelo.atividadesfixacao.atividades.forms;

import br.edu.fema.modelo.atividadesfixacao.atividades.DTO.LugarDTO;
import br.edu.fema.modelo.atividadesfixacao.atividades.models.entities.lugar.Lugar;
import br.edu.fema.modelo.atividadesfixacao.atividades.models.entities.pessoa.Pessoa;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
public class ChurrascoForm {

    @NotNull(message = "Campo não pode ser nulo")
    private String dataInicio;

    private Long id;

    private UUID idLugar;

    private Long anfitriao;

    private String dataFim;
}
