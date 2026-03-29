package ch.uzh.ifi.hase.soprafs26.rest.dto;

import java.util.List;

public class StatsDTO {
    private Integer moviesLogged;
    private Integer highlyRatedMovies;
    private List<String> topGenres;

    public Integer getMoviesLogged() {
        return moviesLogged;
    }

    public void setMoviesLogged(Integer moviesLogged) {
        this.moviesLogged = moviesLogged;
    }

    public Integer getHighlyRatedMovies() {
        return highlyRatedMovies;
    }

    public void setHighlyRatedMovies(Integer highlyRatedMovies) {
        this.highlyRatedMovies = highlyRatedMovies;
    }

    public List<String> getTopGenres() {
        return topGenres;
    }

    public void setTopGenres(List<String> topGenres) {
        this.topGenres = topGenres;
    }
}
