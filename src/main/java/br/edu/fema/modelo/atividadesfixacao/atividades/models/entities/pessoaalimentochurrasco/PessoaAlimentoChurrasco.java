package br.edu.fema.modelo.atividadesfixacao.atividades.models.entities.pessoaalimentochurrasco;

import br.edu.fema.modelo.atividadesfixacao.atividades.models.entities.churrasco.Churrasco;
import br.edu.fema.modelo.atividadesfixacao.atividades.models.entities.pessoa.Pessoa;
import br.edu.fema.modelo.atividadesfixacao.atividades.models.entities.tipoAlimento.Alimento;

import jakarta.persistence.*;

import lombok.*;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "pessoa_alimento_xhurrasco", schema = "public")
public class PessoaAlimentoChurrasco {

    @EmbeddedId
    private PessoaAlimentoChurrascoId id;

    @MapsId("idPessoa")
    @ManyToOne
    @JoinColumn(name = "id_pessoa")
    private Pessoa pessoa;

    @MapsId("idChurrasco")
    @ManyToOne
    @JoinColumn(name = "id_xhurrasco")
    private Churrasco churrasco;

    @MapsId("idAlimento")
    @ManyToOne
    @JoinColumn(name = "id_alimento")
    private Alimento alimento;

    @Column(name = "quantidade")
    private int quantidade;

}
