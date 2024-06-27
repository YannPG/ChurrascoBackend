package br.edu.fema.modelo.atividadesfixacao.atividades.models.entities.pessoa.enums;

import br.edu.fema.modelo.atividadesfixacao.utils.conversao.enums.interfaces.ConvertEnum;
import br.edu.fema.modelo.atividadesfixacao.utils.conversao.enums.service.ConvertEnumMaybeNull;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class LocomocaoConverter implements AttributeConverter<Locomocao, String> {

    private ConvertEnum<Locomocao, String> convertEnum = new ConvertEnumMaybeNull<>();

        @Override
        public String convertToDatabaseColumn(Locomocao locomocao) {
            return convertEnum.getRepresentacaoValorEnumParaBancoDeDados(locomocao);
        }

        @Override
        public Locomocao convertToEntityAttribute(String dbData){
            return convertEnum.getEnum(Locomocao.values(), dbData);
        }
}
