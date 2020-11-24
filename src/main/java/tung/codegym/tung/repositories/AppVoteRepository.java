package tung.codegym.tung.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import tung.codegym.tung.models.AppPost;
import tung.codegym.tung.models.AppVote;

@Repository
public interface AppVoteRepository extends PagingAndSortingRepository<AppVote,Long> {
}
