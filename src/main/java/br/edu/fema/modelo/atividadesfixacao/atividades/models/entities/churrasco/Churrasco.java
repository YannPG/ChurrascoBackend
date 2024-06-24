package br.edu.fema.modelo.atividadesfixacao.atividades.models.entities.churrasco;

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
@Table(name = "xhurrasco", schema = "public")
public class Churrasco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "data_inicio")
    private LocalDateTime dataInicio;

    @Column(name = "data_fim")
    private LocalDateTime dataFim;

    @Column(name = "id_local")
    private String local;

    @OneToOne
    @JoinColumn(name = "id")
    private Pessoa anfitriao;
}
