package finding.a.path.pathfinder.model.dto;

import finding.a.path.pathfinder.enums.Category;
import finding.a.path.pathfinder.enums.Level;

import java.util.Set;

public record AddRouteDTO(String name, String description, Level level, String videoUrl, Set<Category> categories) {
}
