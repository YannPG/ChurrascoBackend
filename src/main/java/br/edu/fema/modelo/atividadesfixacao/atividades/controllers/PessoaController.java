package br.edu.fema.modelo.atividadesfixacao.atividades.controllers;

import br.edu.fema.modelo.atividadesfixacao.atividades.DTO.PessoaDTO;
import br.edu.fema.modelo.atividadesfixacao.atividades.forms.PessoaForm;
import br.edu.fema.modelo.atividadesfixacao.atividades.models.repository.PessoaRepository;
import br.edu.fema.modelo.atividadesfixacao.atividades.service.PessoaService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/pessoa")
public class PessoaController {

    private final PessoaService pessoaService;
    private final PessoaRepository pessoaRepository;

    @ResponseStatus(HttpStatus.ACCEPTED)
    @GetMapping(path = "/buscarPessoas")
    public List<PessoaDTO> buscarTodoPessoa(){
        return this.pessoaService.buscarTodoPessoa();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(path = "/criarPessoa")
    public void criarPessoa(@RequestBody @Valid PessoaForm pessoaForm){
        this.pessoaService.criarPessoa(pessoaForm);
    }

    @ResponseStatus(HttpStatus.MOVED_PERMANENTLY)
    @PutMapping(path = "/atualizarPessoa/{id}")
    public void atualizarPessoa(@RequestBody PessoaForm pessoaForm,
                                @PathVariable Long id){
        this.pessoaService.atualizarPessoa(pessoaForm, id);
    }

    @DeleteMapping(path = "/deletarPessoa/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletarPessoa(@PathVariable Long id){
        this.pessoaService.deletarPessoaPeloId(id);
    }
}
