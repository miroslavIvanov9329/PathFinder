package finding.a.path.pathfinder.controller;

import finding.a.path.pathfinder.exceptions.NotRegisteredUserException;
import finding.a.path.pathfinder.exceptions.NotValidPasswordException;
import finding.a.path.pathfinder.model.dto.UserLoginDTO;
import finding.a.path.pathfinder.service.LoginService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
    
    private final LoginService loginService;
    
    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }
    
    @GetMapping("/users/login")
    public ModelAndView login() {
        return new ModelAndView("login");
    }
    
    @PostMapping("/users/login")
    public ModelAndView login(UserLoginDTO userLoginDTO) throws NotRegisteredUserException, NotValidPasswordException {
        boolean isLoggedIn = loginService.login(userLoginDTO);
        
        if (isLoggedIn) {
            return new ModelAndView("index");
        } else {
            return new ModelAndView("login");
        }
    }
    
}
