package br.com.alexandreestevam.catalog.controller;

import br.com.alexandreestevam.catalog.dto.CategoryDTO;
import br.com.alexandreestevam.catalog.service.CrudService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController()
@RequestMapping("/v1/categories")
public class CategoryController extends SimpleCrudController<CategoryDTO, UUID> {

    public CategoryController(CrudService<CategoryDTO, UUID> crudService) {
        super(crudService);
    }
}
