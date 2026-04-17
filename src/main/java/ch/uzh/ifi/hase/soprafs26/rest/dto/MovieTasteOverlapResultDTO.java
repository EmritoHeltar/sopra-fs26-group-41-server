package ch.uzh.ifi.hase.soprafs26.rest.dto;

public class MovieTasteOverlapResultDTO {
    private String movieId;
    private Integer tasteOverlap;

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public Integer getTasteOverlap() {
        return tasteOverlap;
    }

    public void setTasteOverlap(Integer tasteOverlap) {
        this.tasteOverlap = tasteOverlap;
    }
}