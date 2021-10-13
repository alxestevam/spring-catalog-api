package br.com.alexandreestevam.catalog.service;

import br.com.alexandreestevam.catalog.dto.GenreDTO;
import br.com.alexandreestevam.catalog.entity.Genre;
import br.com.alexandreestevam.catalog.mapper.CrudMapper;
import br.com.alexandreestevam.catalog.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class GenreService extends SimpleCrudService<Genre, GenreDTO, UUID> {
    public GenreService(CrudRepository<Genre, UUID> repository, CrudMapper<Genre, GenreDTO> mapper) {
        super(repository, mapper);
    }

}
