package br.edu.fema.modelo.atividadesfixacao.atividades.models.repository;

import br.edu.fema.modelo.atividadesfixacao.atividades.models.entities.lugar.Lugar;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface LugarRepository extends JpaRepository<Lugar, UUID> {
}
