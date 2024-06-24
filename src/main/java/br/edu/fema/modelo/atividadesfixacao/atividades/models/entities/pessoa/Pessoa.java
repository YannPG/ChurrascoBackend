package br.edu.fema.modelo.atividadesfixacao.atividades.models.entities.pessoa;

import jakarta.persistence.*;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "pessoa", schema = "public")
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String telefone;

    private String situacao;

    @Column(name = "data_confirmacao")
    private String dataConfirmacao;

    private String locomocao;
}
