package br.edu.fema.modelo.atividadesfixacao.atividades.service;

import br.edu.fema.modelo.atividadesfixacao.atividades.DTO.PessoaDTO;
import br.edu.fema.modelo.atividadesfixacao.atividades.forms.PessoaForm;

import java.util.List;

public interface PessoaService {
    List<PessoaDTO> buscarTodoPessoa();

    void criarPessoa(PessoaForm pessoaForm);

    void atualizarPessoa(PessoaForm pessoaForm, Long id);

    void deletarPessoaPeloId(Long id);
}
