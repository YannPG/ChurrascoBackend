package br.edu.fema.modelo.atividadesfixacao.atividades.forms;

import br.edu.fema.modelo.atividadesfixacao.atividades.models.entities.lugar.Endereco;
import jakarta.persistence.Column;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;

import java.math.BigDecimal;
import java.util.UUID;

@Getter
public class LugarForm {

    private UUID id;

    @NotNull(message = "Não pode ser nulo")
    private int vagaEstacionamento;
    private int limiteDePessoas;
    private BigDecimal valor;
    private String cep;
    private String rua;
    private String numeroCasa;
    private String complemento;
    private String cidade;
    private String estado;
}
