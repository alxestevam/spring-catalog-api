package br.com.alexandreestevam.catalog.service;

import br.com.alexandreestevam.catalog.exception.EntityNotFoundException;
import br.com.alexandreestevam.catalog.mapper.CrudMapper;
import br.com.alexandreestevam.catalog.repository.CrudRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
public abstract class SimpleCrudService<T, K, ID> implements CrudService<K, ID> {
    private CrudRepository<T, ID> repository;

    private CrudMapper<T, K> mapper;

    public Page<K> findAll(Integer pageNo, Integer pageSize, String sortBy) {
        Page<T> entities = repository.findAll(PageRequest.of(pageNo, pageSize, Sort.by(sortBy)));

        List<K> dtoList = entities.get().map(mapper::toDto).collect(Collectors.toList());

        return new PageImpl<>(dtoList, entities.getPageable(), dtoList.size());
    }

    public K create(K request) {
        T savedEntity = mapAndSaveToRepository(request);
        return mapper.toDto(savedEntity);
    }

    public K update(ID id, K request) {
        getEntityOrThrow(id);
        return mapper.toDto(mapAndSaveToRepository(request));
    }

    public void delete(ID id) {
        T entity = getEntityOrThrow(id);

        repository.delete(entity);
    }

    public K findById(ID id) {
        T entity = getEntityOrThrow(id);

        return mapper.toDto(entity);
    }

    private T getEntityOrThrow(ID id) {
        return repository.findById(id).orElseThrow(() -> EntityNotFoundException.builder().build());
    }

    private T mapAndSaveToRepository(K request) {
        T entityToSave = mapper.toEntity(request);
        return repository.save(entityToSave);
    }

}
