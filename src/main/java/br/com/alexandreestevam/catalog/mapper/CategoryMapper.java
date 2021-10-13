package br.com.alexandreestevam.catalog.mapper;

import br.com.alexandreestevam.catalog.dto.CategoryDTO;
import br.com.alexandreestevam.catalog.entity.Category;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CategoryMapper extends CrudMapper<Category, CategoryDTO> {
}
