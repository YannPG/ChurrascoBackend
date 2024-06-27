package br.edu.fema.modelo.atividadesfixacao.atividades.DTO;

import br.edu.fema.modelo.atividadesfixacao.atividades.models.entities.pessoa.Pessoa;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
@NoArgsConstructor
public class PessoaDTO {

    private Long id;

    private String nome;

    private String telefone;

    private String situacao;

    private String dataConfirmacao;

    private String locomocao;

    public PessoaDTO(Pessoa pessoa){
        this.id = pessoa.getId();
        this.nome = pessoa.getNome();
        this.telefone = pessoa.getTelefone();
        this.situacao = pessoa.getSituacao().getDescricao();
        this.dataConfirmacao = pessoa.getDataConfirmacao();
        this.locomocao = pessoa.getLocomocao().getDescricao();
    }

    public static List<PessoaDTO> converter(List<Pessoa> listaDePessoa){
        return listaDePessoa
                .stream()
                .map(PessoaDTO::new)
                .collect(Collectors.toList());
    }
}
