package finding.a.path.pathfinder.model.session;

import finding.a.path.pathfinder.enums.UserRoles;
import org.springframework.web.context.annotation.SessionScope;

@SessionScope()
public class CurrentUser {
    private String username;
    private String fullName;
    private String email;
    private UserRoles userRole;
    private boolean isLogged;
    
    public String getUsername() {
        return username;
    }
    
    public void setUsername(String username) {
        this.username = username;
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
    
    public void logout() {
        this.username = null;
        this.fullName = null;
        this.email = null;
        this.isLogged = false;
    }
    
    public boolean isLogged() {
        return isLogged;
    }
    
    public void setLogged(boolean logged) {
        isLogged = logged;
    }
    
    public UserRoles getUserRole() {
        return userRole;
    }
    
    public void setUserRole(UserRoles userRole) {
        this.userRole = userRole;
    }
}
