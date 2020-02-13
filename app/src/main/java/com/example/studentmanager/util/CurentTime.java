package com.example.studentmanager.util;

import android.util.Log;

import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class CurentTime {
    public CurentTime() {
    }

    public String getCurrentTime(){
        String cTime = null;
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            cTime = LocalTime.now().toString();
        }
        else {
            cTime = sdf.format(cal.getTime());
        }

        return cTime;
    }

    public String getCurrentDate(){
        String date = new String();

        return date;
    }
}
