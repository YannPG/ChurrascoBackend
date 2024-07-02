package br.edu.fema.modelo.atividadesfixacao.atividades.service;

import br.edu.fema.modelo.atividadesfixacao.atividades.forms.ChurrascoForm;
import br.edu.fema.modelo.atividadesfixacao.atividades.models.entities.churrasco.Churrasco;

import java.util.List;

public interface ChurrascoService {

    List<Churrasco> buscarTodosChurrascos();

    void criarChurrasco(ChurrascoForm churrascoForm, Long id);

    void atualizarChurrasco(ChurrascoForm churrascoForm, Long id);

    List<Churrasco> buscarChurrascoPorData(String dataBusca);

    List<Churrasco> buscarChurrascoEntreData(String dataBusca, String dataBusca2);

    void deletarChurrasco(Long id);
}
