package br.com.alexandreestevam.catalog.controller;

import br.com.alexandreestevam.catalog.dto.CastMemberDTO;
import br.com.alexandreestevam.catalog.service.CrudService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/v1/cast-members")
public class CastMemberController extends SimpleCrudController<CastMemberDTO, UUID> {
    public CastMemberController(CrudService<CastMemberDTO, UUID> crudService) {
        super(crudService);
    }
}
