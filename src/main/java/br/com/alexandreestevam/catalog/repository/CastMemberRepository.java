package br.com.alexandreestevam.catalog.repository;

import br.com.alexandreestevam.catalog.dto.CastMemberDTO;
import br.com.alexandreestevam.catalog.entity.CastMember;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

public interface CastMemberRepository extends PagingAndSortingRepository<CastMember, UUID>, CrudRepository<CastMember, UUID> {
}
