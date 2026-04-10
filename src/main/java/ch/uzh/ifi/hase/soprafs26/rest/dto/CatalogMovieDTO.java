package ch.uzh.ifi.hase.soprafs26.rest.dto;

public class CatalogMovieDTO {
    private Integer id;
    private String title;
    private Integer year;
    private String genres;

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public Integer getYear() { return year; }
    public void setYear(Integer year) { this.year = year; }
    public String getGenres() { return genres; }
    public void setGenres(String genres) { this.genres = genres; }
}