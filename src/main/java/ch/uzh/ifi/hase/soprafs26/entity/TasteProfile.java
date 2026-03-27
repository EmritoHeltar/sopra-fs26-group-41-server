package ch.uzh.ifi.hase.soprafs26.entity;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Embeddable;
import jakarta.persistence.FetchType;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Embeddable
public class TasteProfile implements Serializable {

    @ElementCollection(fetch = FetchType.EAGER)
    private List<RatedMovie> ratedMovies = new ArrayList<>();

    public List<RatedMovie> getRatedMovies() {
        return ratedMovies;
    }

    public void setRatedMovies(List<RatedMovie> ratedMovies) {
        this.ratedMovies = ratedMovies != null ? ratedMovies : new ArrayList<>();
    }
}
