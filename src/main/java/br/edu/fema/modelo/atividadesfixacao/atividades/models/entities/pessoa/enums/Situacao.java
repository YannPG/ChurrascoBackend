package br.edu.fema.modelo.atividadesfixacao.atividades.models.entities.pessoa.enums;

public enum Situacao {

    COMFIRMADO("C"),
    AGUARDANDO("A"),
    RECUSADO("R");

    final private String situcao;

    Situacao(String situcao){
        this.situcao = situcao;
    }
    public String getDescricao(){
        return situcao;
    }

}