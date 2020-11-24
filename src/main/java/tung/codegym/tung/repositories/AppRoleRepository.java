package tung.codegym.tung.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import tung.codegym.tung.models.AppRole;
import tung.codegym.tung.models.AppUser;

@Repository
public interface AppRoleRepository extends PagingAndSortingRepository<AppRole,Long> {
}
