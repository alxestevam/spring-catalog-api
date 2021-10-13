package br.com.alexandreestevam.catalog.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface CrudRepository<T, ID> {
    Page<T> findAll(Pageable pageable);
    T save(T entity);
    void delete(T entity);
    Optional<T> findById(ID id);
}
