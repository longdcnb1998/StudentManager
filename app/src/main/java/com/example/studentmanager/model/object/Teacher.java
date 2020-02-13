package com.example.studentmanager.model.object;

public class Teacher {

   private String nameTeacher, subject, timeStamp, sdt;
   private String  postition;
   private String nameClass;
   private String username,password;

    public Teacher() {
    }

    public Teacher(String nameTeacher, String subject, String timeStamp, String sdt, String postition, String nameClass, String username, String password) {
        this.nameTeacher = nameTeacher;
        this.subject = subject;
        this.timeStamp = timeStamp;
        this.sdt = sdt;
        this.postition = postition;
        this.nameClass = nameClass;
        this.username = username;
        this.password = password;
    }

    public String getNameTeacher() {
        return nameTeacher;
    }

    public void setNameTeacher(String nameTeacher) {
        this.nameTeacher = nameTeacher;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getPostition() {
        return postition;
    }

    public void setPostition(String postition) {
        this.postition = postition;
    }

    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
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
