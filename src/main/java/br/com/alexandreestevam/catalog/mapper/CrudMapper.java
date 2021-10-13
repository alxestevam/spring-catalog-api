package br.com.alexandreestevam.catalog.mapper;

public interface CrudMapper<T, K> {

    K toDto(T entity);

    T toEntity(K dto);
}
