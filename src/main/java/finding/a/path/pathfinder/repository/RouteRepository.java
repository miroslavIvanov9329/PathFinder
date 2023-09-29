package finding.a.path.pathfinder.repository;

import finding.a.path.pathfinder.model.Route;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RouteRepository extends JpaRepository<Route, Long> {
    Route findByName(String name);
}
