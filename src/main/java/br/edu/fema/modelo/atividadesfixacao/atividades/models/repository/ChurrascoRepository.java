package br.edu.fema.modelo.atividadesfixacao.atividades.models.repository;

import br.edu.fema.modelo.atividadesfixacao.atividades.models.entities.churrasco.Churrasco;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface ChurrascoRepository extends JpaRepository<Churrasco, Long> {
    List<Churrasco> findByDataInicioGreaterThanEqual(LocalDateTime dataBusca);

    List<Churrasco> findAllByDataInicioGreaterThanEqualAndAndDataInicioLessThanEqual(LocalDateTime dataBusca, LocalDateTime dataBusca2);
}

