package finding.a.path.pathfinder.service;

import finding.a.path.pathfinder.model.User;

import java.util.List;
import java.util.Set;

public interface UserService {
    List<User> getUsers();
    
    void logout();
}
