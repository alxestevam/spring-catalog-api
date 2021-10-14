package br.com.alexandreestevam.catalog.dto;

import br.com.alexandreestevam.catalog.entity.CastMember;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class CastMemberDTO {

    @NotNull
    private String name;

    @NotNull
    private CastMember.Type type;
}
