package com.example.crud_interface.services;

public class TimeOfDayService {
    public String getTimeOfDayPeriod(int time) {
        if(time < 0)
            return null;

        if(time >= 5 && time <= 11)
            return "morning";

        else if(time >= 12 && time <= 15)
            return "afternoon";

        else if(time >= 16 && time <= 21)
            return "evening";

        return "night";
    }
}
