package br.edu.fema.modelo.atividadesfixacao.atividades.models.entities.lugar;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "lugar", schema = "atividade_fixacao")
public class Lugar {

    @Embedded
    private Endereco endereco;

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "vagas_estacionamento")
    private int vagasEstacionamento;

    @Column(name = "limite_de_pessoas")
    private int limiteDePessoas;

    @Column(precision = 5, scale = 2)
    private BigDecimal valor;
}
