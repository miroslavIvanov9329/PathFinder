package finding.a.path.pathfinder.controller;

import finding.a.path.pathfinder.model.User;
import finding.a.path.pathfinder.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class UserController {
    private final UserService userService;
    
    public UserController(UserService userService) {
        this.userService = userService;
    }
    
    @GetMapping("/users/all")
    public List<User> getAllUsers() {
        return userService.getUsers();
    }
    
    @GetMapping("logout")
    public ModelAndView logout() {
        userService.logout();
        return new ModelAndView("index");
    }
}
