package br.edu.fema.modelo.atividadesfixacao.atividades.controllers;

import br.edu.fema.modelo.atividadesfixacao.atividades.DTO.AlimentoDTO;
import br.edu.fema.modelo.atividadesfixacao.atividades.forms.AlimentoForm;
import br.edu.fema.modelo.atividadesfixacao.atividades.models.entities.tipoAlimento.Alimento;
import br.edu.fema.modelo.atividadesfixacao.atividades.models.repository.AlimentoRepository;
import br.edu.fema.modelo.atividadesfixacao.atividades.service.AlimentoService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("/alimento")
public class AlimentoController {

    private final AlimentoService alimentoService;
    private final AlimentoRepository alimentoRepository;

    @ResponseStatus(HttpStatus.ACCEPTED)
    @GetMapping(path ="/buscarAlimento")
    public List<AlimentoDTO> buscarTodoAlimento(){
        return this.alimentoService.buscarTodoAlimento();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(path = "/criarAlimento")
    public void criarAlimento(@RequestBody @Valid AlimentoForm alimentoForm){
        this.alimentoService.criarAlimento(alimentoForm);
    }

    @PutMapping(path = "/atualizarAlimento/{id}")
    public void atualizarAlimento(@RequestBody AlimentoForm alimentoForm,
                                  @PathVariable UUID id){
        this.alimentoService.atualizarAlimento(alimentoForm, id);
    }

    @DeleteMapping
    public void deletarAlimentoPeloId(UUID id){
        this.alimentoRepository.findById(id);
    }
}
