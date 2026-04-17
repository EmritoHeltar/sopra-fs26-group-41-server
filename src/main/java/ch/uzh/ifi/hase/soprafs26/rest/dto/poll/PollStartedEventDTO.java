package ch.uzh.ifi.hase.soprafs26.rest.dto.poll;

public class PollStartedEventDTO {
    private String type;
    private String event;
    private Long groupId;
    private String message;
    private String url;

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public String getEvent() { return event; }
    public void setEvent(String event) { this.event = event; }

    public Long getGroupId() { return groupId; }
    public void setGroupId(Long groupId) { this.groupId = groupId; }

    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }

    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
