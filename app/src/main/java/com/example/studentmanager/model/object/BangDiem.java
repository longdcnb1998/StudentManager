package com.example.studentmanager.model.object;

import com.example.studentmanager.model.subject.English;
import com.example.studentmanager.model.subject.Literature;

public class BangDiem {
    private English english;
    private Literature literature;
    private Math math;

    public BangDiem(English english, Literature literature, Math math) {
        this.english = english;
        this.literature = literature;
        this.math = math;
    }

    public English getEnglish() {
        return english;
    }

    public void setEnglish(English english) {
        this.english = english;
    }

    public Literature getLiterature() {
        return literature;
    }

    public void setLiterature(Literature literature) {
        this.literature = literature;
    }

    public Math getMath() {
        return math;
    }

    public void setMath(Math math) {
        this.math = math;
    }
}
