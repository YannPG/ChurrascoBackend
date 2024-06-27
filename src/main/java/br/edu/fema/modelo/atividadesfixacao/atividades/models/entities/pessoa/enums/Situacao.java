package br.edu.fema.modelo.atividadesfixacao.atividades.models.entities.pessoa.enums;


import br.edu.fema.modelo.atividadesfixacao.utils.conversao.enums.interfaces.ValorEnum;
import br.edu.fema.modelo.atividadesfixacao.utils.conversao.enums.service.DesserializadorEnum;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@JsonDeserialize(using = DesserializadorEnum.class)
public enum Situacao implements ValorEnum<String> {

    COMFIRMADO("C", "Confirmado"),
    AGUARDANDO("A", "Aguardando"),
    RECUSADO("R", "Recusado");

    private String valor;
    private String descricao;

}