package br.com.alexandreestevam.catalog.service;

import br.com.alexandreestevam.catalog.dto.CategoryDTO;
import br.com.alexandreestevam.catalog.entity.Category;
import br.com.alexandreestevam.catalog.mapper.CrudMapper;
import br.com.alexandreestevam.catalog.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CategoryService extends SimpleCrudService<Category, CategoryDTO, UUID> {
    public CategoryService(CrudRepository<Category, UUID> repository, CrudMapper<Category, CategoryDTO> mapper) {
        super(repository, mapper);
    }

}
