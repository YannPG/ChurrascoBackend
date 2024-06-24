package br.edu.fema.modelo.atividadesfixacao.atividades.service;

import br.edu.fema.modelo.atividadesfixacao.atividades.models.entities.churrasco.Churrasco;

import java.util.List;

public interface ChurrascoService {
    List<Churrasco> buscarTodosChurrascos();

    List<Churrasco> buscarChurrascoPorData(String dataBusca);

    List<Churrasco> buscarChurrascoEntreData(String dataBusca, String dataBusca2);
}
