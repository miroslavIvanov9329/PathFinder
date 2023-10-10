package finding.a.path.pathfinder.model;

import finding.a.path.pathfinder.enums.Category;
import jakarta.persistence.*;

@Entity
@Table(name = "categories")
public class Categories extends BaseEntity{

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Category name;
    
    @Column(nullable = false, columnDefinition = "TEXT")
    private String description;
    
    public Category getName() {
        return name;
    }
    
    public void setName(Category name) {
        this.name = name;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
}
