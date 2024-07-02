package br.edu.fema.modelo.atividadesfixacao.atividades.models.entities.churrasco;

import br.edu.fema.modelo.atividadesfixacao.atividades.models.entities.lugar.Lugar;
import br.edu.fema.modelo.atividadesfixacao.atividades.models.entities.pessoa.Pessoa;

import jakarta.persistence.*;

import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "xhurrasco", schema = "atividade_fixacao")
public class Churrasco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "data_inicio")
    private LocalDateTime dataInicio;

    @Column(name = "data_fim")
    private LocalDateTime dataFim;

    @Column(name = "id_lugar")
    private UUID idLugar;

    @ManyToOne
    @JoinColumn(name = "id_lugar", updatable = false, insertable = false)
    private Lugar lugar;


    @Column(name = "anfitriao")
    private Long idAnfitriao;

    @OneToOne
    @JoinColumn(name = "id")
    private Pessoa anfitriao;
}
