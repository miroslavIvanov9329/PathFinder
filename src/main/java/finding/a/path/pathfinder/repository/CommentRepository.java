package finding.a.path.pathfinder.repository;

import finding.a.path.pathfinder.model.Comments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<Comments, Long> {
}
