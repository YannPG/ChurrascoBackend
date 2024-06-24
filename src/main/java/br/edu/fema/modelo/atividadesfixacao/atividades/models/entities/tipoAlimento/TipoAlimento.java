package br.edu.fema.modelo.atividadesfixacao.atividades.models.entities.tipoAlimento;

import jakarta.persistence.*;

import jakarta.validation.constraints.NotNull;
import lombok.*;


@Getter
@Setter
@AllArgsConstructor @ToString
@NoArgsConstructor
@Entity
@Table(name = "tipo_comes_e_bebes")
public class TipoAlimento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private long id;

    @NotNull
    @Column(name = "descricao")
    private String descricao;

}
