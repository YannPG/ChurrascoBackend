package br.edu.fema.modelo.atividadesfixacao.atividades.controllers;


import br.edu.fema.modelo.atividadesfixacao.atividades.DTO.LugarDTO;
import br.edu.fema.modelo.atividadesfixacao.atividades.forms.LugarForm;
import br.edu.fema.modelo.atividadesfixacao.atividades.service.LugarService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/lugar")
public class LugarController {

    private final LugarService lugarService;

    @ResponseStatus(HttpStatus.ACCEPTED)
    @GetMapping(path ="/buscarLugar")
    public List<LugarDTO> buscarTodosOsLugares(){
        return this.lugarService.buscarTodoLugar();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(path = "/criarLugar")
    public void criarLugar(@RequestBody @Valid LugarForm lugarForm, UUID id){
        this.lugarService.criarLugar(lugarForm, id);
    }

}
