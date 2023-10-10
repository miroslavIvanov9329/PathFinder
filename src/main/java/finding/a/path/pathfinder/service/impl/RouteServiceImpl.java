package finding.a.path.pathfinder.service.impl;

import finding.a.path.pathfinder.model.Categories;
import finding.a.path.pathfinder.model.Route;
import finding.a.path.pathfinder.model.User;
import finding.a.path.pathfinder.model.dto.AddRouteDTO;
import finding.a.path.pathfinder.repository.CategoryRepository;
import finding.a.path.pathfinder.repository.RouteRepository;
import finding.a.path.pathfinder.service.CurrentUserService;
import finding.a.path.pathfinder.service.RouteService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class RouteServiceImpl implements RouteService {
    
    private final RouteRepository routeRepository;
    private final CategoryRepository categoryRepository;
    private final CurrentUserService currentUserService;
    
    public RouteServiceImpl(RouteRepository routeRepository, CategoryRepository categoryRepository, CurrentUserService currentUserService) {
        this.routeRepository = routeRepository;
        this.categoryRepository = categoryRepository;
        this.currentUserService = currentUserService;
    }
    
    @Override
    public void addRoute(AddRouteDTO addRouteDTO) {
        Route route = new Route();
    
        User currentUser = currentUserService.getCurrentUser();
    
        route.setName(addRouteDTO.name());
        route.setDescription(addRouteDTO.description());
        route.setLevel(addRouteDTO.level());
        route.setVideoUrl(addRouteDTO.videoUrl());
        route.setAuthor(currentUser);
        
        route.getCategories().clear();;
    
        Set<Categories> categories = categoryRepository.findByNameIn(addRouteDTO.categories());
        route.addCategories(categories);
        
        routeRepository.save(route);
    }
}
