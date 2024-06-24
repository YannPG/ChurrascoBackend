package br.edu.fema.modelo.atividadesfixacao.atividades.models.repository;

import br.edu.fema.modelo.atividadesfixacao.atividades.models.entities.pessoa.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {
}
