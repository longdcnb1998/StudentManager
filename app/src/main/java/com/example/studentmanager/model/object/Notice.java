package com.example.studentmanager.model.object;

public class Notice {
    private String content;
    private String timeStamp;

    public Notice() {
    }

    public Notice(String content, String timeStamp) {
        this.content = content;
        this.timeStamp = timeStamp;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }
}
