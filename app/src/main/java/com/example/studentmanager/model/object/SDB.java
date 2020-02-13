package com.example.studentmanager.model.object;

public class SDB {
    private String lesson;
    private String dayOfWeek;
    private String date;
    private String subject;
    private String teacher;
    private String content;

    public SDB() {
    }

    public SDB(String lesson, String dayOfWeek, String date, String subject, String teacher, String content) {
        this.lesson = lesson;
        this.dayOfWeek = dayOfWeek;
        this.date = date;
        this.subject = subject;
        this.teacher = teacher;
        this.content = content;
    }

    public String getLesson() {
        return lesson;
    }

    public void setLesson(String lesson) {
        this.lesson = lesson;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
