package br.edu.fema.modelo.atividadesfixacao.atividades.DTO;

import br.edu.fema.modelo.atividadesfixacao.atividades.models.entities.churrasco.Churrasco;
import br.edu.fema.modelo.atividadesfixacao.atividades.models.entities.pessoa.Pessoa;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
@NoArgsConstructor
public class ChurrascoDTO {

    private Long id;

    private LocalDateTime dataInicio;

    private LocalDateTime datFim;

    private LugarDTO lugarDTO;

    private PessoaDTO anfitriao;

    public ChurrascoDTO(Churrasco churrasco) {
        this.id = churrasco.getId();
        this.dataInicio = churrasco.getDataInicio();
        this.datFim = churrasco.getDataFim();
        this.lugarDTO = new LugarDTO(churrasco.getLugar());
        this.anfitriao = new PessoaDTO(churrasco.getAnfitriao());
    }

    public static List<ChurrascoDTO> converter (List<Churrasco> listaDeChurrasco) {
        return listaDeChurrasco
                .stream()
                .map(ChurrascoDTO::new)
                .collect(Collectors.toList());
    }
}
