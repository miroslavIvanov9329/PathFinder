package finding.a.path.pathfinder.service.impl;

import finding.a.path.pathfinder.model.User;
import finding.a.path.pathfinder.model.session.CurrentUser;
import finding.a.path.pathfinder.repository.UserRepository;
import finding.a.path.pathfinder.service.CurrentUserService;
import org.springframework.stereotype.Service;

@Service
public class CurrentUserServiceImpl implements CurrentUserService {
    
    private final CurrentUser currentUser;
    private final UserRepository userRepository;
    
    public CurrentUserServiceImpl(CurrentUser currentUser, UserRepository userRepository) {
        this.currentUser = currentUser;
        this.userRepository = userRepository;
    }
    
    @Override
    public User getCurrentUser() {
        return userRepository.findByUsername(currentUser.getUsername());
    }
}
