package com.example.studentmanager.model.object;

public class Morning {
    private int dihoc = 0;
    private int cophep = 0;

    public Morning() {
    }

    public Morning(int dihoc, int cophep) {
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
