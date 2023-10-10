package finding.a.path.pathfinder.service.impl;

import finding.a.path.pathfinder.enums.Level;
import finding.a.path.pathfinder.model.User;
import finding.a.path.pathfinder.model.dto.UserRegisterDTO;
import finding.a.path.pathfinder.repository.UserRepository;
import finding.a.path.pathfinder.service.RegisterService;
import org.modelmapper.ModelMapper;
import org.springframework.security.crypto.password.Pbkdf2PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class RegisterServiceImpl implements RegisterService {
    
    private final UserRepository userRepository;
    private final Pbkdf2PasswordEncoder passwordEncoder;
    
    public RegisterServiceImpl(UserRepository userRepository, Pbkdf2PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }
    
    @Override
    public void register(UserRegisterDTO userRegisterDTO) {
        User user = new User();
        
        user.setLevel(Level.BEGINNER);
        user.setUsername(userRegisterDTO.username());
        user.setFullName(userRegisterDTO.fullName());
        user.setEmail(userRegisterDTO.email());
        user.setAge(userRegisterDTO.age());
        user.setPassword(passwordEncoder.encode(userRegisterDTO.password()));
        
        userRepository.save(user);
    }
}
