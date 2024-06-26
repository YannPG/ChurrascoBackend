package br.edu.fema.modelo.atividadesfixacao.atividades.DTO;

import br.edu.fema.modelo.atividadesfixacao.atividades.models.entities.tipoAlimento.TipoAlimento;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
@NoArgsConstructor
public class TipoAlimentoDTO  {

    private String descricao;

    public TipoAlimentoDTO(TipoAlimento tipoAlimento) {
        this.descricao = tipoAlimento.getDescricao();
    }

    public static List<TipoAlimentoDTO> converter (List<TipoAlimento> listaDeTipoAlimento) {
        return listaDeTipoAlimento
                .stream()
                .map(TipoAlimentoDTO::new)
                .collect(Collectors.toList());
    }
}
