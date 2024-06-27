package br.edu.fema.modelo.atividadesfixacao.atividades.models.entities.pessoa.enums;

import br.edu.fema.modelo.atividadesfixacao.utils.conversao.enums.interfaces.ConvertEnum;
import br.edu.fema.modelo.atividadesfixacao.utils.conversao.enums.service.ConvertEnumMaybeNull;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class SituacaoConverter implements AttributeConverter<Situacao, String> {

    private ConvertEnum<Situacao, String> convertEnum = new ConvertEnumMaybeNull<>();

        @Override
        public String convertToDatabaseColumn(Situacao situacao) {
            return convertEnum.getRepresentacaoValorEnumParaBancoDeDados(situacao);
        }

        @Override
        public Situacao convertToEntityAttribute(String dbData){
            return convertEnum.getEnum(Situacao.values(), dbData);
        }
}
