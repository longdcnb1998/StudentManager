package com.example.studentmanager.model.object;

import java.util.ArrayList;

public class Classes {
    private String nameClass;
    private ArrayList<SDB> sdbs;
    private ArrayList<Notice> Notices;


    public Classes() {
    }

    public Classes(String nameClass, ArrayList<SDB> sdbs, ArrayList<Notice> notices) {
        this.nameClass = nameClass;
        this.sdbs = sdbs;
        Notices = notices;
    }

    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }

    public ArrayList<SDB> getSdbs() {
        return sdbs;
    }

    public void setSdbs(ArrayList<SDB> sdbs) {
        this.sdbs = sdbs;
    }

    public ArrayList<Notice> getNotices() {
        return Notices;
    }

    public void setNotices(ArrayList<Notice> notices) {
        Notices = notices;
    }
}
