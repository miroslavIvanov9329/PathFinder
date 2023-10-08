package finding.a.path.pathfinder.controller;

import finding.a.path.pathfinder.model.dto.UserRegisterDTO;
import finding.a.path.pathfinder.service.RegisterService;
import finding.a.path.pathfinder.service.impl.RegisterServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegisterController {
    
    private final RegisterService registerService;
    
    public RegisterController(RegisterService registerService) {
        this.registerService = registerService;
    }
    
    @GetMapping("/users/register")
    public ModelAndView register() {
        return new ModelAndView("register");
    }
    
    @PostMapping("/users/register")
    public ModelAndView register(UserRegisterDTO userRegisterDTO) {
        registerService.register(userRegisterDTO);
        
        return new ModelAndView("redirect:login");
    }
}
