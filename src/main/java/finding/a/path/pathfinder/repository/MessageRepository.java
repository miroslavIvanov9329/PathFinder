package finding.a.path.pathfinder.repository;

import finding.a.path.pathfinder.model.Messages;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageRepository extends JpaRepository<Messages, Long> {
}
