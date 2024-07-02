package br.edu.fema.modelo.atividadesfixacao.atividades.controllers;


import br.edu.fema.modelo.atividadesfixacao.atividades.DTO.LugarDTO;
import br.edu.fema.modelo.atividadesfixacao.atividades.service.LugarService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/local")
public class LugarController {

    private final LugarService lugarService;

    @ResponseStatus(HttpStatus.ACCEPTED)
    @GetMapping(path ="/buscarLocal")
    public List<LugarDTO> buscarTodosOsLugares(){
        return this.lugarService.buscarTodoLugar();
    }


}
