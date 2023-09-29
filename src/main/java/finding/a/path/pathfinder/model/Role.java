package finding.a.path.pathfinder.model;


import finding.a.path.pathfinder.enums.UserRoles;
import jakarta.persistence.*;

@Entity
@Table(name = "roles")
public class Role extends BaseEntity {
    
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private UserRoles name;
    
    public UserRoles getName() {
        return name;
    }
    
    public void setName(UserRoles name) {
        this.name = name;
    }
}
