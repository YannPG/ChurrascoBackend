package br.edu.fema.modelo.atividadesfixacao.atividades.service.impl;

import br.edu.fema.modelo.atividadesfixacao.atividades.DTO.LugarDTO;
import br.edu.fema.modelo.atividadesfixacao.atividades.forms.LugarForm;
import br.edu.fema.modelo.atividadesfixacao.atividades.models.entities.lugar.Lugar;
import br.edu.fema.modelo.atividadesfixacao.atividades.models.repository.LugarRepository;
import br.edu.fema.modelo.atividadesfixacao.atividades.service.LugarService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class LugarServiceImpl implements LugarService {

    private final LugarRepository lugarRepository;

    @Override
    public List<LugarDTO> buscarTodoLugar() {
        List<Lugar> listDeLugares = this.lugarRepository.findAll();
        if(listDeLugares.isEmpty()) throw new ResponseStatusException(HttpStatus.NOT_FOUND
                ,"lista de lugares está vazia");
        return LugarDTO.converter(listDeLugares);
    }

    @Override
    @Transactional
    public void criarLugar(LugarForm lugarForm, UUID id) {
        Lugar lugarCriado = new Lugar();
        lugarCriado.setId(id);
        lugarCriado.setLimiteDePessoas(lugarForm.getLimiteDePessoas());
        lugarCriado.setValor(lugarForm.getValor());
        lugarCriado.setVagasEstacionamento(lugarForm.getVagaEstacionamento());
        lugarCriado.getEndereco().setCep(lugarForm.getCep());
        lugarCriado.getEndereco().setCidade(lugarForm.getCidade());
        lugarCriado.getEndereco().setRua(lugarForm.getRua());
        lugarCriado.getEndereco().setEstado(lugarForm.getEstado());
        lugarCriado.getEndereco().setComplemento(lugarForm.getComplemento());
        lugarCriado.getEndereco().setNumeroCasa(lugarForm.getNumeroCasa());
    }
}
