package finding.a.path.pathfinder.config;

import finding.a.path.pathfinder.model.session.CurrentUser;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.Pbkdf2PasswordEncoder;
import org.springframework.ui.ModelMap;

@Configuration
public class AppConfig {
    
    @Bean
    public Pbkdf2PasswordEncoder passwordEncoder() {
        return Pbkdf2PasswordEncoder.defaultsForSpringSecurity_v5_8();
    }
    
    @Bean
    public CurrentUser currentUser() {
        return new CurrentUser();
    }

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
