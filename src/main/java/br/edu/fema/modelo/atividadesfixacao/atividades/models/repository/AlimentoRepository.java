package br.edu.fema.modelo.atividadesfixacao.atividades.models.repository;

import br.edu.fema.modelo.atividadesfixacao.atividades.models.entities.tipoAlimento.Alimento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;


@Repository
public interface AlimentoRepository extends JpaRepository<Alimento, UUID> {
}
