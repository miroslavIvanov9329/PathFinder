package finding.a.path.pathfinder.service.impl;

import finding.a.path.pathfinder.exceptions.NotRegisteredUserException;
import finding.a.path.pathfinder.exceptions.NotValidPasswordException;
import finding.a.path.pathfinder.model.User;
import finding.a.path.pathfinder.model.dto.UserLoginDTO;
import finding.a.path.pathfinder.model.session.CurrentUser;
import finding.a.path.pathfinder.repository.UserRepository;
import finding.a.path.pathfinder.service.LoginService;
import org.springframework.security.crypto.password.Pbkdf2PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {
    
    private final UserRepository userRepository;
    private final Pbkdf2PasswordEncoder passwordEncoder;
    
    private final CurrentUser currentUser;
    
    public LoginServiceImpl(UserRepository userRepository, Pbkdf2PasswordEncoder passwordEncoder, CurrentUser currentUser) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
        this.currentUser = currentUser;
    }
    
    @Override
    public boolean login(UserLoginDTO userLoginDTO) throws NotRegisteredUserException, NotValidPasswordException {
        User user = userRepository.findByUsername(userLoginDTO.username());
        
        if (user != null) {
            boolean samePasswords = passwordEncoder.matches(userLoginDTO.password(), user.getPassword());
            currentUser.setUsername(user.getUsername());
            currentUser.setFullName(user.getFullName());
            currentUser.setEmail(user.getEmail());
            currentUser.setLogged(true);
        } else {
            return false;
        }
        
        return true;
    }
}
