package ch.uzh.ifi.hase.soprafs26.rest.dto;

import org.mapstruct.Builder;

import java.util.List;

public class LetterboxdImportResponse {
    private Long id;
    private String username;
    private Boolean hasLetterboxdData;
    private Stats stats;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Boolean getHasLetterboxdData() {
        return hasLetterboxdData;
    }

    public void setHasLetterboxdData(Boolean hasLetterboxdData) {
        this.hasLetterboxdData = hasLetterboxdData;
    }

    public Stats getStats() {
        return stats;
    }

    public void setStats(Stats stats) {
        this.stats = stats;
    }

    public static class Stats {
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
}

