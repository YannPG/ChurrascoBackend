package br.edu.fema.modelo.atividadesfixacao.atividades.models.repository;

import br.edu.fema.modelo.atividadesfixacao.atividades.models.entities.tipoAlimento.TipoAlimento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoAlimentoRepository extends JpaRepository<TipoAlimento, Long> {
}
