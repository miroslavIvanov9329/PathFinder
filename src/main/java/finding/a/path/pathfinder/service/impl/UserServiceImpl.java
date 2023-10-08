package finding.a.path.pathfinder.service.impl;

import finding.a.path.pathfinder.model.User;
import finding.a.path.pathfinder.model.session.CurrentUser;
import finding.a.path.pathfinder.repository.UserRepository;
import finding.a.path.pathfinder.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final CurrentUser currentUser;
    
    @Autowired
    public UserServiceImpl(UserRepository userRepository, CurrentUser currentUser) {
        this.userRepository = userRepository;
        this.currentUser = currentUser;
    }
    
    @Override
    public List<User> getUsers() {
        return userRepository.findAll();
    }
    
    @Override
    public void logout() {
        currentUser.logout();
    }
    
    
}
