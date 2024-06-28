package br.edu.fema.modelo.atividadesfixacao.atividades.models.repository;

import br.edu.fema.modelo.atividadesfixacao.atividades.DTO.PessoaDTO;
import br.edu.fema.modelo.atividadesfixacao.atividades.models.entities.pessoa.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
    List<Pessoa> findAllByOrderByNomeAsc();
}
