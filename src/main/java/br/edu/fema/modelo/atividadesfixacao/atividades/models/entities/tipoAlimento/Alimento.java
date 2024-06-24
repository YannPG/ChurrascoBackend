package br.edu.fema.modelo.atividadesfixacao.atividades.models.entities.tipoAlimento;

import jakarta.persistence.*;

import lombok.*;

import java.math.BigDecimal;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "comes_e_bebes")
public class Alimento {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "valor")
    private BigDecimal valor;

    @Column(name = "id_tipo_alimento")
    private Long idTipoAlimento;

    @ManyToOne
    @JoinColumn(name = "id_tipo_alimento", updatable = false, insertable = false)
    private TipoAlimento tipoAlimento;
}
