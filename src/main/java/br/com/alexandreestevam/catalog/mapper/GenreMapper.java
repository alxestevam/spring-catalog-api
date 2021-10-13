package br.com.alexandreestevam.catalog.mapper;

import br.com.alexandreestevam.catalog.dto.GenreDTO;
import br.com.alexandreestevam.catalog.entity.Genre;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface GenreMapper extends CrudMapper<Genre, GenreDTO> {
}
