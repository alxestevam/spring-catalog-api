package br.com.alexandreestevam.catalog.exception;

import lombok.Builder;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
@Builder
public class EntityNotFoundException extends RuntimeException {
}
