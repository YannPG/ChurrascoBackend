package br.edu.fema.modelo.atividadesfixacao.atividades.models.entities.lugar;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.*;

@Getter
@Setter
@Embeddable
@NoArgsConstructor
@EqualsAndHashCode
@AllArgsConstructor
public class Endereco {

    @Column
    private String cep;

    @Column
    private String rua;

    @Column(name = "numero")
    private String numeroCasa;

    @Column
    private String complemento;

    @Column
    private String cidade;

    @Column
    private String estado;

}
