package br.com.alexandreestevam.catalog.repository;

import br.com.alexandreestevam.catalog.entity.Genre;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

public interface GenreRepository extends CrudRepository<Genre, UUID>, PagingAndSortingRepository<Genre, UUID> {
}
