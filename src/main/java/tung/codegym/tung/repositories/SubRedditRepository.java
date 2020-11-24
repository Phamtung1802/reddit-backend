package tung.codegym.tung.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import tung.codegym.tung.models.AppVote;
import tung.codegym.tung.models.SubReddit;

@Repository
public interface SubRedditRepository extends PagingAndSortingRepository<SubReddit,Long> {
}
