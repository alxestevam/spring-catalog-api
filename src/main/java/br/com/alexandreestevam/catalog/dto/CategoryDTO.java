package br.com.alexandreestevam.catalog.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.UUID;

@Data
public class CategoryDTO {
    private UUID id;

    @NotNull
    private String name;

    @NotNull
    private String description;

    @NotNull
    private Boolean isActive;
}
