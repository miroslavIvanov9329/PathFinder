package finding.a.path.pathfinder.controller;

import finding.a.path.pathfinder.enums.Category;
import finding.a.path.pathfinder.enums.Level;
import finding.a.path.pathfinder.model.dto.AddRouteDTO;
import finding.a.path.pathfinder.service.RouteService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RouteController {
    
    private final RouteService routeService;
    
    public RouteController(RouteService routeService) {
        this.routeService = routeService;
    }
    
    @GetMapping("/routes/add")
    public ModelAndView addRoute() {
        ModelAndView modelAndView = new ModelAndView("add-route");
    
        modelAndView.addObject("levels", Level.values());
        modelAndView.addObject("categories", Category.values());
    
        return modelAndView;
    }
    
    @PostMapping("/routes/add")
    public ModelAndView addRoute(AddRouteDTO addRouteDTO) {
        routeService.addRoute(addRouteDTO);
        return new ModelAndView("redirect:/");
    }
}
