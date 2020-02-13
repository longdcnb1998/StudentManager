package com.example.studentmanager.model.object;

import java.util.ArrayList;

public class School {
    private ArrayList<Teacher> teachers;
    private ArrayList<NewsFeed> NewsFeeds;
    private ArrayList<Meeting> meetings;
    private ArrayList<Classes> classes;
    private ArrayList<Student> students;
    private String username;
    private String password;

    public School() {
    }

    public School(ArrayList<Teacher> teachers, ArrayList<NewsFeed> NewsFeeds, ArrayList<Meeting> meetings, ArrayList<Classes> classes, ArrayList<Student> students, String username, String password) {
        this.teachers = teachers;
        this.NewsFeeds = NewsFeeds;
        this.meetings = meetings;
        this.classes = classes;
        this.students = students;
        this.username = username;
        this.password = password;
    }

    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(ArrayList<Teacher> teachers) {
        this.teachers = teachers;
    }

    public ArrayList<NewsFeed> getNewsFeeds() {
        return NewsFeeds;
    }

    public void setNewsFeeds(ArrayList<NewsFeed> newsFeeds) {
        this.NewsFeeds = newsFeeds;
    }

    public ArrayList<Meeting> getMeetings() {
        return meetings;
    }

    public void setMeetings(ArrayList<Meeting> meetings) {
        this.meetings = meetings;
    }

    public ArrayList<Classes> getClasses() {
        return classes;
    }

    public void setClasses(ArrayList<Classes> classes) {
        this.classes = classes;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
