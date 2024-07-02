package br.edu.fema.modelo.atividadesfixacao.atividades.DTO;

import br.edu.fema.modelo.atividadesfixacao.atividades.models.entities.lugar.Lugar;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Getter
@Setter
@NoArgsConstructor
public class LugarDTO {

    private UUID id;

    private Integer vagasEstacionamento;

    private Integer limiteDePessoas;

    private BigDecimal valor;

    public LugarDTO(Lugar lugar){
        this.id = lugar.getId();
        this.vagasEstacionamento = lugar.getVagasEstacionamento();
        this.limiteDePessoas = lugar.getLimiteDePessoas();
        this.valor = lugar.getValor();
    }

    public static List<LugarDTO> converter (List<Lugar> listDeLugar){
        return listDeLugar
                .stream()
                .map(LugarDTO::new)
                .collect(Collectors.toList());
    }
}
