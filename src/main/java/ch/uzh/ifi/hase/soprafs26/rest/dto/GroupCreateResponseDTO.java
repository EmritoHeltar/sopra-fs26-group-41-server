package ch.uzh.ifi.hase.soprafs26.rest.dto;

import ch.uzh.ifi.hase.soprafs26.entity.User;

import java.io.File;

public class GroupCreateResponseDTO {
    private Long id;
    private String name;
    private UserGetDTO owner;
    private File groupProfilePicture;
    private String joinUrl;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public File getGroupProfilePicture() {
        return groupProfilePicture;
    }

    public void setGroupProfilePicture(File groupProfilePicture) {
        this.groupProfilePicture = groupProfilePicture;
    }

    public String getJoinUrl() {
        return joinUrl;
    }

    public void setJoinUrl(String joinUrl) {
        this.joinUrl = joinUrl;
    }

    public UserGetDTO getOwner() {
        return owner;
    }

    public void setOwner(UserGetDTO owner) {
        this.owner = owner;
    }
}
