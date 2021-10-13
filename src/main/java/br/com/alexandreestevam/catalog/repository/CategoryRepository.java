package br.com.alexandreestevam.catalog.repository;

import br.com.alexandreestevam.catalog.entity.Category;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

public interface CategoryRepository extends PagingAndSortingRepository<Category, UUID>, CrudRepository<Category, UUID> {
}
