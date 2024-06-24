package br.edu.fema.modelo.atividadesfixacao.atividades.DTO;

import br.edu.fema.modelo.atividadesfixacao.atividades.models.entities.tipoAlimento.Alimento;
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
public class AlimentoDTO {

    private UUID id;

    private String descricao;

    private BigDecimal valor;

    private TipoAlimentoDTO tipoAlimentoDTO;

    public  AlimentoDTO(Alimento alimento){
        this.id = alimento.getId();
        this.descricao = alimento.getDescricao();
        this.valor = alimento.getValor();
        this.tipoAlimentoDTO = new TipoAlimentoDTO(alimento.getTipoAlimento());
    }

    public static List<AlimentoDTO> converter(List<Alimento> listaDeAlimento){
        return listaDeAlimento
                .stream()
                .map(AlimentoDTO::new)
                .collect(Collectors.toList());
    }
}
