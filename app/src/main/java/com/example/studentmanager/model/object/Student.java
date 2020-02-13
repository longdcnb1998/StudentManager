package com.example.studentmanager.model.object;

import com.example.studentmanager.model.subject.English;
import com.example.studentmanager.model.subject.Literature;
import com.example.studentmanager.model.subject.Math;

public class Student {
    private String nameStudent,
    username,
    password,
    sdtgd;

    private Morning morning;
    private Afternoon afternoon;
    private Math math;
    private Literature literature;
    private English english;

    public Student() {
    }

    public Student(String nameStudent, String username, String password, String sdtgd, Morning morning, Afternoon afternoon, Math math, Literature literature, English english) {
        this.nameStudent = nameStudent;
        this.username = username;
        this.password = password;
        this.sdtgd = sdtgd;
        this.morning = morning;
        this.afternoon = afternoon;
        this.math = math;
        this.literature = literature;
        this.english = english;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
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

    public String getSdtgd() {
        return sdtgd;
    }

    public void setSdtgd(String sdtgd) {
        this.sdtgd = sdtgd;
    }

    public Morning getMorning() {
        return morning;
    }

    public void setMorning(Morning morning) {
        this.morning = morning;
    }

    public Afternoon getAfternoon() {
        return afternoon;
    }

    public void setAfternoon(Afternoon afternoon) {
        this.afternoon = afternoon;
    }

    public Math getMath() {
        return math;
    }

    public void setMath(Math math) {
        this.math = math;
    }

    public Literature getLiterature() {
        return literature;
    }

    public void setLiterature(Literature literature) {
        this.literature = literature;
    }

    public English getEnglish() {
        return english;
    }

    public void setEnglish(English english) {
        this.english = english;
    }
}
