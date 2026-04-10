package ch.uzh.ifi.hase.soprafs26.rest.dto;
import java.util.List;

public class OverlapRequestDTO {
    private List<String> watched_ids; // Or List<Integer> depending on your RatedMovie ID format
    private String target_movie_id;   // Or Integer

    public OverlapRequestDTO(List<String> watched_ids, String target_movie_id) {
        this.watched_ids = watched_ids;
        this.target_movie_id = target_movie_id;
    }

    // Add Getters and Setters
    public List<String> getWatched_ids() { return watched_ids; }
    public void setWatched_ids(List<String> watched_ids) { this.watched_ids = watched_ids; }
    public String getTarget_movie_id() { return target_movie_id; }
    public void setTarget_movie_id(String target_movie_id) { this.target_movie_id = target_movie_id; }
}