package br.com.alexandreestevam.catalog.mapper;

import br.com.alexandreestevam.catalog.dto.CastMemberDTO;
import br.com.alexandreestevam.catalog.entity.CastMember;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CastMemberMapper extends CrudMapper<CastMember, CastMemberDTO> {
}
