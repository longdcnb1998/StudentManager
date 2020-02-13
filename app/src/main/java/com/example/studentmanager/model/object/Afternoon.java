package com.example.studentmanager.model.object;

public class Afternoon {
    private int dihoc = 0;
    private int cophep = 0;

    public Afternoon() {
    }

    public Afternoon(int dihoc, int cophep) {
        this.dihoc = dihoc;
        this.cophep = cophep;
    }

    public int getDihoc() {
        return dihoc;
    }

    public void setDihoc(int dihoc) {
        this.dihoc = dihoc;
    }

    public int getCophep() {
        return cophep;
    }

    public void setCophep(int cophep) {
        this.cophep = cophep;
    }
}
