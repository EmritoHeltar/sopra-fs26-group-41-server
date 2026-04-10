package ch.uzh.ifi.hase.soprafs26.rest.dto;
import java.util.List;

public class OverlapRequestDTO {
    private List<Long> watched_ids;
    private String target_movie_id;


    public OverlapRequestDTO(List<Long> watched_ids, String target_movie_id) {
        this.watched_ids = watched_ids;
        this.target_movie_id = target_movie_id;
    }

    public List<Long> getWatched_ids() { return watched_ids; }
    public void setWatched_ids(List<Long> watched_ids) { this.watched_ids = watched_ids; }

    public String getTarget_movie_id() { return target_movie_id; }
    public void setTarget_movie_id(String target_movie_id) { this.target_movie_id = target_movie_id; }
}