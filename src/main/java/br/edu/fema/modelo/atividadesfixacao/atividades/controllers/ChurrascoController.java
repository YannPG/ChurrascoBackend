package br.edu.fema.modelo.atividadesfixacao.atividades.controllers;

import br.edu.fema.modelo.atividadesfixacao.atividades.models.entities.churrasco.Churrasco;
import br.edu.fema.modelo.atividadesfixacao.atividades.service.ChurrascoService;
import br.edu.fema.modelo.atividadesfixacao.atividades.service.impl.ChurrascoServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/xurasco")
@RequiredArgsConstructor
public class ChurrascoController {

    private final ChurrascoService churrascoService;

    @GetMapping("/buscarTodos")
    public List<Churrasco> buscarTodosChurrascos() {
        return this.churrascoService.buscarTodosChurrascos();
    }

    @GetMapping("/depoisDaData/{buscaData}")
    public List<Churrasco> buscarChurrascoPorData(@PathVariable String buscaData){
        return this.churrascoService.buscarChurrascoPorData(buscaData);
    }

    @GetMapping("/entreDatas")
    public List<Churrasco> buscarChurrascoEntreData(@RequestParam(name = "data1") String buscaData,
                                                    @RequestParam(name = "data2") String buscaData2){
        return this.churrascoService.buscarChurrascoEntreData(buscaData, buscaData2);
    }
}
