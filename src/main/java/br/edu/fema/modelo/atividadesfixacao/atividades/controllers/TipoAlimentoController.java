package br.edu.fema.modelo.atividadesfixacao.atividades.controllers;

import br.edu.fema.modelo.atividadesfixacao.atividades.DTO.TipoAlimentoDTO;
import br.edu.fema.modelo.atividadesfixacao.atividades.forms.TipoAlimentoForm;
import br.edu.fema.modelo.atividadesfixacao.atividades.service.TipoAlimentoService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("/tipoAlimento")
public class TipoAlimentoController {

    private final TipoAlimentoService tipoAlimentoService;

    @ResponseStatus(HttpStatus.ACCEPTED)
    @GetMapping(path ="/buscarTipoAlimento")
    public List<TipoAlimentoDTO> buscarTodosTipoAlimento(){
        return this.tipoAlimentoService.buscarTodosTipoAlimento();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(path = "/criarTipoAlimento")
    public void criarTipoAlimento(@RequestBody @Valid TipoAlimentoForm tipoAlimentoForm){
        this.tipoAlimentoService.criaTipoALimento(tipoAlimentoForm);
    }

    @ResponseStatus(HttpStatus.MOVED_PERMANENTLY)
    @PutMapping(path = "/atualizarTipoAlimento/{id}")
    public void atualizarTipoAlimento(@RequestBody TipoAlimentoForm tipoAlimentoForm,
                                  @PathVariable Long id){
        this.tipoAlimentoService.atualizarTipoAlimento(tipoAlimentoForm, id);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping(path = "/deletar/{id}")
    public void deletarTipoAlimentoPeloId(@PathVariable Long id){
        tipoAlimentoService.deletarTipoAlimentoPeloId(id);
    }
}
