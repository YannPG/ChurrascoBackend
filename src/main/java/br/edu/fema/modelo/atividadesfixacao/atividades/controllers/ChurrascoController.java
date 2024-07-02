package br.edu.fema.modelo.atividadesfixacao.atividades.controllers;

import br.edu.fema.modelo.atividadesfixacao.atividades.forms.ChurrascoForm;
import br.edu.fema.modelo.atividadesfixacao.atividades.models.entities.churrasco.Churrasco;
import br.edu.fema.modelo.atividadesfixacao.atividades.service.ChurrascoService;
import br.edu.fema.modelo.atividadesfixacao.atividades.service.impl.ChurrascoServiceImpl;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/xurasco")
@RequiredArgsConstructor
public class ChurrascoController {

    private final ChurrascoService churrascoService;

    @ResponseStatus(HttpStatus.ACCEPTED)
    @GetMapping(path ="/buscarTodos")
    public List<Churrasco> buscarTodosChurrascos() {
        return this.churrascoService.buscarTodosChurrascos();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(path = "/criarChurrasco")
    public void criarChurrasco(@RequestBody @Valid ChurrascoForm churrascoForm, Long id){
        this.churrascoService.criarChurrasco(churrascoForm, id);
    }

    @ResponseStatus(HttpStatus.MOVED_PERMANENTLY)
    @PutMapping(path = "/atualizarChurrasco/{id}")
    public void atualizarChurrasco(@RequestBody ChurrascoForm churrascoForm,
                                   @PathVariable Long id){
        this.churrascoService.atualizarChurrasco(churrascoForm, id);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping(path = "/deletarChurrasco/{id}")
    public void deletarChurrasco(@PathVariable Long id){
        this.churrascoService.deletarChurrasco(id);
    }



    @ResponseStatus(HttpStatus.ACCEPTED)
    @GetMapping(path = "/depoisDaData/{buscaData}")
    public List<Churrasco> buscarChurrascoPorData(@PathVariable String buscaData){
        return this.churrascoService.buscarChurrascoPorData(buscaData);
    }

    @ResponseStatus(HttpStatus.ACCEPTED)
    @GetMapping(path = "/entreDatas")
    public List<Churrasco> buscarChurrascoEntreData(@RequestParam(name = "data1") String buscaData,
                                                    @RequestParam(name = "data2") String buscaData2){
        return this.churrascoService.buscarChurrascoEntreData(buscaData, buscaData2);
    }
}
