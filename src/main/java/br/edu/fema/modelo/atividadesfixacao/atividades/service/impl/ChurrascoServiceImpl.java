package br.edu.fema.modelo.atividadesfixacao.atividades.service.impl;

import br.edu.fema.modelo.atividadesfixacao.atividades.models.entities.churrasco.Churrasco;
import br.edu.fema.modelo.atividadesfixacao.atividades.models.repository.ChurrascoRepository;
import br.edu.fema.modelo.atividadesfixacao.atividades.service.ChurrascoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ChurrascoServiceImpl implements ChurrascoService {

    private final ChurrascoRepository churrascoRepository;

    @Override
    public List<Churrasco> buscarTodosChurrascos() {
        return this.churrascoRepository.findAll();
    }

    @Override
    public List<Churrasco> buscarChurrascoPorData(String dataBusca){
        return this.churrascoRepository.findByDataInicioGreaterThanEqual(LocalDateTime
                .parse(dataBusca, DateTimeFormatter
                        .ofPattern("uuuu-MM-dd HH:mm:ss")));
    }

    @Override
    public List<Churrasco> buscarChurrascoEntreData(String dataBusca, String dataBusca2){
        return this.churrascoRepository.findAllByDataInicioGreaterThanEqualAndAndDataInicioLessThanEqual(
                LocalDateTime
                        .parse(dataBusca, DateTimeFormatter.ofPattern("uuuu-MM-dd HH:mm:ss")),
                LocalDateTime
                        .parse(dataBusca2, DateTimeFormatter.ofPattern("uuuu-MM-dd HH:mm:ss")));
    }
}
