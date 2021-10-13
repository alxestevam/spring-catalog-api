package br.com.alexandreestevam.catalog.controller;

import br.com.alexandreestevam.catalog.dto.GenreDTO;
import br.com.alexandreestevam.catalog.service.CrudService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController()
@RequestMapping("/v1/genres")
public class GenreController extends SimpleCrudController<GenreDTO, UUID> {
    public GenreController(CrudService<GenreDTO, UUID> crudService) {
        super(crudService);
    }
}
