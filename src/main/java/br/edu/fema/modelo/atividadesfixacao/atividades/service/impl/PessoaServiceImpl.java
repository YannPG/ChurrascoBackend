package br.edu.fema.modelo.atividadesfixacao.atividades.service.impl;

import br.edu.fema.modelo.atividadesfixacao.atividades.DTO.PessoaDTO;
import br.edu.fema.modelo.atividadesfixacao.atividades.forms.PessoaForm;
import br.edu.fema.modelo.atividadesfixacao.atividades.models.entities.pessoa.Pessoa;
import br.edu.fema.modelo.atividadesfixacao.atividades.models.entities.tipoAlimento.Alimento;
import br.edu.fema.modelo.atividadesfixacao.atividades.models.repository.PessoaRepository;
import br.edu.fema.modelo.atividadesfixacao.atividades.service.PessoaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PessoaServiceImpl implements PessoaService {

    private final PessoaRepository pessoaRepository;

    @Override
    public List<PessoaDTO> buscarTodoPessoa() {
        List<Pessoa> listTodaPessoa = this.pessoaRepository.findAll();
        if(listTodaPessoa.isEmpty()) throw new ResponseStatusException(HttpStatus.NOT_FOUND
                ,"lista de alimentos está vazia");
        return PessoaDTO.converter(listTodaPessoa);
    }

    @Override
    public void criarPessoa(PessoaForm pessoaForm) {
        Pessoa pessoaCriada = new Pessoa();
        pessoaCriada.setNome(pessoaForm.getNome());
        pessoaCriada.setLocomocao(pessoaForm.getLocomocao());
        pessoaCriada.setTelefone(pessoaForm.getTelefone());
        pessoaCriada.setSituacao(pessoaForm.getSituacao());
        pessoaCriada.setDataConfirmacao(pessoaForm.getDataConfirmacao());
        this.pessoaRepository.save(pessoaCriada);
    }

    @Override
    public void atualizarPessoa(PessoaForm pessoaForm, Long id) {
        Optional<Pessoa> pessoaEncontrada = this.pessoaRepository.findById(id);
        if(pessoaEncontrada.isEmpty()) throw new RuntimeException("Essa Pessoa não existe");
        this.pessoaRepository.save(converterForm(pessoaForm, id));
    }

    private Pessoa converterForm(PessoaForm pessoaForm, Long id) {
        Pessoa pessoa = new Pessoa();
        pessoa.setId(id);
        pessoa.setNome(pessoaForm.getNome());
        pessoa.setLocomocao(pessoaForm.getLocomocao());
        pessoa.setTelefone(pessoaForm.getTelefone());
        pessoa.setSituacao(pessoaForm.getSituacao());
        pessoa.setDataConfirmacao(pessoaForm.getDataConfirmacao());
        return pessoa;
    }

    @Override
    public void deletarPessoaPeloId(Long id){
        this.pessoaRepository.deleteById(id);
    }

}
