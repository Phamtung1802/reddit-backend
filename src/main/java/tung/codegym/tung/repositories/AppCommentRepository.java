package tung.codegym.tung.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import tung.codegym.tung.models.AppComment;
import tung.codegym.tung.models.SubReddit;

@Repository
public interface AppCommentRepository extends PagingAndSortingRepository<AppComment,Long> {
}
