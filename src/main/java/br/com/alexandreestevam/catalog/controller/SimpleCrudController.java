package br.com.alexandreestevam.catalog.controller;

import br.com.alexandreestevam.catalog.service.CrudService;
import br.com.alexandreestevam.catalog.service.SimpleCrudService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@AllArgsConstructor
public abstract class SimpleCrudController<K, ID> implements CrudController<K, ID> {
    private final CrudService<K, ID> crudService;

    @GetMapping
    public Page<K> index(
            @RequestParam(defaultValue = "0") Integer pageNo,
            @RequestParam(defaultValue = "10") Integer pageSize,
            @RequestParam(defaultValue = "id") String sortBy
    ) {
        return crudService.findAll(pageNo, pageSize, sortBy);
    }

    @GetMapping("{id}")
    public K show(@PathVariable ID id) {
        return crudService.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public K create(@RequestBody @Valid K request) {
        return crudService.create(request);
    }

    @PutMapping("{id}")
    public K update(@PathVariable ID id, @RequestBody @Valid K request) {
        return crudService.update(id, request);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable ID id) {
        crudService.delete(id);
    }
}
