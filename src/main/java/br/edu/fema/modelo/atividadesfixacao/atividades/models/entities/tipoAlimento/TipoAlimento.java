package br.edu.fema.modelo.atividadesfixacao.atividades.models.entities.tipoAlimento;

import jakarta.persistence.*;

import jakarta.validation.constraints.NotNull;
import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tipo_comes_e_bebes", schema = "atividade_fixacao")
public class TipoAlimento {

    @Id
    private Long id;

    @Column(name = "descricao")
    private String descricao;

}
