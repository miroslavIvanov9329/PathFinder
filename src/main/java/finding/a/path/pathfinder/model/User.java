package finding.a.path.pathfinder.model;

import finding.a.path.pathfinder.enums.UserLevel;
import finding.a.path.pathfinder.enums.UserRoles;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "users")
public class User extends BaseEntity {
    
    @Column(nullable = false, unique = true)
    @Size(min = 2)
    private String username;
    
    @Column(nullable = false)
    @Size(min = 2)
    private String password;
    
    @Column(name = "full_name")
    @Size(min = 2)
    private String fullName;
    
    @Column(nullable = false, unique = true)
    @Email
    private String email;
    
    @ManyToMany()
    private Set<Role> roles;
    
    @Enumerated(EnumType.STRING)
    private UserLevel level;
    
    public User() {
        this.roles = new HashSet<>();
    }
    
    public String getUsername() {
        return username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getFullName() {
        return fullName;
    }
    
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public Set<Role> getRole() {
        return roles;
    }
    
    public void setRole(Set<Role> role) {
        this.roles = role;
    }
    
    public UserLevel getLevel() {
        return level;
    }
    
    public void setLevel(UserLevel level) {
        this.level = level;
    }
}