package br.edu.fema.modelo.atividadesfixacao.atividades.models.entities.pessoa.enums;


import lombok.Getter;

@Getter
public enum Locomocao {

    CARRO("C"),
    MOTO("M"),
    OUTROS("O");

    final private String locomocao;

    Locomocao(String locomocao){
        this.locomocao = locomocao;
    }
}
