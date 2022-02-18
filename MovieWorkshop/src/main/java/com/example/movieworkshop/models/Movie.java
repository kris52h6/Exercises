package com.example.movieworkshop.models;

public class Movie implements Comparable {
    private int year;
    private int length;
    private String title;
    private String subject;
    private int popularity;
    private String awards;

    public Movie(int year, int length, String title, String subject, int popularity, String awards) {
        this.year = year;
        this.length = length;
        this.title = title;
        this.subject = subject;
        this.popularity = popularity;
        this.awards = awards;
    }

    public int getYear() {
        return year;
    }

    public int getLength() {
        return length;
    }

    public String getTitle() {
        return title;
    }

    public String getSubject() {
        return subject;
    }

    public int getPopularity() {
        return popularity;
    }

    public String getAwards() {
        return awards;
    }

    @Override
    public int compareTo(Object o) {
        Movie movie = (Movie) o;
        if (popularity > movie.popularity) {
            return 1;
        } else {
            return 0;
        }
    }

}

