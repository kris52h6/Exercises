package com.example.hellospring.services;

public class calculateday {

    public calculateday() {}

    public int calculateDay() {
        int q = 15; // day
        int m = 2; // month
        int y = 2022; // year
        if (m == 1) {
            m = 13;
            y--;
        } else if (m == 2) {
            m = 14;
            y--;
        }
        int k = y % 100;
        int j = y / 100;
        int h = (q + (13 * (m+1) / 5) + k + (k/4) + (j/4) - (2*j) ) % 7;

        return ((h+5)%7) +1; // convert monday to 1, tuesday to 2, etc. (friday = 5)
    }

}
