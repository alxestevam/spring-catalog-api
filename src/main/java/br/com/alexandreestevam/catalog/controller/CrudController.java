package br.com.alexandreestevam.catalog.controller;

import org.springframework.data.domain.Page;

public interface CrudController<K, ID> {
    Page<K> index(
            Integer pageNo,
            Integer pageSize,
            String sortBy
    );

    K show(ID id);

    K create(K request);

    K update(ID id, K request);

    void delete(ID id);
}
