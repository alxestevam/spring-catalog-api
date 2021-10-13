package br.com.alexandreestevam.catalog.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.UUID;

@Data
public class GenreDTO {
    private UUID id;

    @NotNull
    private String name;
}
