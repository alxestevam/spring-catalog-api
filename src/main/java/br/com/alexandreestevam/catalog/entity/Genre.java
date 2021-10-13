package br.com.alexandreestevam.catalog.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@Getter
@Setter
public class Genre extends BaseEntity {

    @Column(nullable = false)
    private String name;
}
