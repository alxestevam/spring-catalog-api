package br.com.alexandreestevam.catalog.service;

import org.springframework.data.domain.Page;

public interface CrudService<K, ID> {
    Page<K> findAll(Integer pageNo, Integer pageSize, String sortBy);

    K create(K request);

    K update(ID id, K request);

    void delete(ID id);

    K findById(ID id);
}
