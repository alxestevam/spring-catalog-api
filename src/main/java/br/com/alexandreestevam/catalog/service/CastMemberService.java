package br.com.alexandreestevam.catalog.service;

import br.com.alexandreestevam.catalog.dto.CastMemberDTO;
import br.com.alexandreestevam.catalog.entity.CastMember;
import br.com.alexandreestevam.catalog.mapper.CrudMapper;
import br.com.alexandreestevam.catalog.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CastMemberService extends SimpleCrudService<CastMember, CastMemberDTO, UUID> {
    public CastMemberService(CrudRepository<CastMember, UUID> repository, CrudMapper<CastMember, CastMemberDTO> mapper) {
        super(repository, mapper);
    }
}
