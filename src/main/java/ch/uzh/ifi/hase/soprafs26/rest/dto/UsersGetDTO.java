package ch.uzh.ifi.hase.soprafs26.rest.dto;

import ch.uzh.ifi.hase.soprafs26.constant.UserStatus;
import com.fasterxml.jackson.annotation.JsonInclude;

public class UsersGetDTO {
    private Long id;
    private String username;
    private Boolean hasLetterboxdData;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer tasteOverlap;

    private StatsDTO stats;


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
    public Integer getTasteOverlap() {
        return tasteOverlap;
    }
    public void setTasteOverlap(Integer tasteOverlap) {
        this.tasteOverlap = tasteOverlap;
    }
    public StatsDTO getStats() {
        return stats;
    }
    public void setStats(StatsDTO stats) {
        this.stats = stats;
    }
}
