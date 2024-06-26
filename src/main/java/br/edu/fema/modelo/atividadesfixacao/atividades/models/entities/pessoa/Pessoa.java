package br.edu.fema.modelo.atividadesfixacao.atividades.models.entities.pessoa;

import br.edu.fema.modelo.atividadesfixacao.atividades.models.entities.pessoa.enums.Locomocao;
import br.edu.fema.modelo.atividadesfixacao.atividades.models.entities.pessoa.enums.Situacao;
import jakarta.persistence.*;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "pessoa", schema = "atividade_fixacao")
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String telefone;

    private Situacao situacao;

    @Column(name = "data_confirmacao")
    private String dataConfirmacao;

    private Locomocao locomocao;
}
