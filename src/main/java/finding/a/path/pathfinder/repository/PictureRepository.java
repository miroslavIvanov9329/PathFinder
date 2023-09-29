package finding.a.path.pathfinder.repository;

import finding.a.path.pathfinder.model.Pictures;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PictureRepository extends JpaRepository<Pictures, Long> {
}
