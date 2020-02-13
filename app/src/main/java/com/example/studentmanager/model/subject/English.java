package com.example.studentmanager.model.subject;

public class English {
    private String mieng;
    private String quarter;
    private String half;
    private String full;

    public English() {
    }

    public English(String mieng, String quarter, String half, String full) {
        this.mieng = mieng;
        this.quarter = quarter;
        this.half = half;
        this.full = full;
    }

    public String getMieng() {
        return mieng;
    }

    public void setMieng(String mieng) {
        this.mieng = mieng;
    }

    public String getQuarter() {
        return quarter;
    }

    public void setQuarter(String quarter) {
        this.quarter = quarter;
    }

    public String getHalf() {
        return half;
    }

    public void setHalf(String half) {
        this.half = half;
    }

    public String getFull() {
        return full;
    }

    public void setFull(String full) {
        this.full = full;
    }
}
