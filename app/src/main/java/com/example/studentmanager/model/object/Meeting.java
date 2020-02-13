package com.example.studentmanager.model.object;

public class Meeting {
    private String message;
    private String timeStamp;
    private String from;

    public Meeting() {
    }

    public Meeting(String message, String timeStamp, String from) {
        this.message = message;
        this.timeStamp = timeStamp;
        this.from = from;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }
}
