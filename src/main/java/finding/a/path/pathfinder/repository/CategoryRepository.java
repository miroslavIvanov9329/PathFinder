package finding.a.path.pathfinder.repository;

import finding.a.path.pathfinder.enums.Category;
import finding.a.path.pathfinder.model.Categories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface CategoryRepository extends JpaRepository<Categories, Long> {
    Set<Categories> findByNameIn(Set<Category> categories);
}
