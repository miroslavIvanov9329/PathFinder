package finding.a.path.pathfinder.model;

import finding.a.path.pathfinder.enums.Category;
import finding.a.path.pathfinder.enums.Level;
import jakarta.persistence.*;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "routes")
public class Route extends BaseEntity {
    
    @Column(name = "gpx_coordinates", columnDefinition = "LONGTEXT")
    private String gpxCoordinates;
    
    @Enumerated(EnumType.STRING)
    private Level level;
    
    @Column(nullable = false)
    private String name;
    
    @Column(nullable = false, columnDefinition = "TEXT")
    private String description;
    
    @ManyToOne
    private User author;
    
    @Column(name = "video_url")
    private String videoUrl;
    
    @ManyToMany
    private Set<Categories> categories;
    
    public Route() {
        this.categories = new HashSet<>();
    }
    
    public String getGpxCoordinates() {
        return gpxCoordinates;
    }
    
    public void setGpxCoordinates(String gpxCoordinates) {
        this.gpxCoordinates = gpxCoordinates;
    }
    
    public Level getLevel() {
        return level;
    }
    
    public void setLevel(Level level) {
        this.level = level;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public User getAuthor() {
        return author;
    }
    
    public void setAuthor(User author) {
        this.author = author;
    }
    
    public String getVideoUrl() {
        return videoUrl;
    }
    
    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }
    
    public Set<Categories> getCategories() {
        return categories;
    }
    
    public void setCategories(Set<Categories> categories) {
        this.categories = categories;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public void addCategories(Set<Categories> categories) {
        this.categories.addAll(categories);
    }
}
