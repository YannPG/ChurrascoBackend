package br.edu.fema.modelo.atividadesfixacao.atividades.models.entities.pessoaalimentochurrasco;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

import java.util.UUID;

@Embeddable
public class PessoaAlimentoChurrascoId implements Serializable {

    @Column(name = "id_alimento")
    private UUID idAlimento;

    @Column(name = "id_pessoa")
    private Long idPessoa;

    @Column(name = "id_xhurrasco")
    private Long idChurrasco;
}
