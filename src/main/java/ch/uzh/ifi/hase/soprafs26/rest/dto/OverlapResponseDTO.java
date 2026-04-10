package ch.uzh.ifi.hase.soprafs26.rest.dto;

public class OverlapResponseDTO {
    private String target_id;
    private Double overlap_score; // Python returns a float like 0.8543

    // Add Getters and Setters
    public String getTarget_id() { return target_id; }
    public void setTarget_id(String target_id) { this.target_id = target_id; }
    public Double getOverlap_score() { return overlap_score; }
    public void setOverlap_score(Double overlap_score) { this.overlap_score = overlap_score; }
}