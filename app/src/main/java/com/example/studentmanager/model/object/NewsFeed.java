package com.example.studentmanager.model.object;

public class NewsFeed {
    private String timeStamp,
    content,
    urlImage;

    public NewsFeed() {
    }

    public NewsFeed(String timeStamp, String content, String urlImage) {
        this.timeStamp = timeStamp;
        this.content = content;
        this.urlImage = urlImage;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }
}
