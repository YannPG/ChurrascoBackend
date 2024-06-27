package br.edu.fema.modelo.atividadesfixacao.atividades.forms;

import br.edu.fema.modelo.atividadesfixacao.atividades.models.entities.pessoa.enums.Locomocao;
import br.edu.fema.modelo.atividadesfixacao.atividades.models.entities.pessoa.enums.Situacao;
import jakarta.persistence.Column;
import lombok.Getter;

@Getter
public class PessoaForm {

    private Long id;

    private String nome;

    private String telefone;

    private Situacao situacao;

    private String dataConfirmacao;

    private Locomocao locomocao;
}
