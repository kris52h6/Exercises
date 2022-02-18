package com.example.movieworkshop.services;

import com.example.movieworkshop.models.Movie;
import com.example.movieworkshop.repositories.MovieFileReader;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class MovieServices {

    public static Movie getFirstMovie() {
        MovieFileReader.getData();
        ArrayList<Movie> movieDataList = MovieFileReader.getListOfMovies();
        return movieDataList.get(0);
    }

    public static String getRandomMovie() {
        MovieFileReader.getData();
        ArrayList<Movie> movieDataList = MovieFileReader.getListOfMovies();

        Random randGenerator = new Random();
        int number = randGenerator.nextInt(movieDataList.size()) + 1;
        return movieDataList.get(number).getTitle();
    }

    public static ArrayList<Movie> getTenSortByPopularity() {
        MovieFileReader.getData();
        ArrayList<Movie> movieDataList = MovieFileReader.getListOfMovies();
        ArrayList<Movie> listOfRandomMovies = new ArrayList<>();

        Random randGenerator = new Random();
        int count = 0;
        while (count <= 10) {
            int number = randGenerator.nextInt(movieDataList.size()) + 1;
            listOfRandomMovies.add(movieDataList.get(number));
            count++;
        }
        // kan ikke få min sort til at virke med compareble, (pga. static?)
        Collections.sort(listOfRandomMovies);
        return listOfRandomMovies;
    }

    public static String getMoviesWithAwards() {
        MovieFileReader.getData();
        ArrayList<Movie> movieDataList = MovieFileReader.getListOfMovies();
        ArrayList<Movie> moviesWithAwards = new ArrayList<>();

        for (Movie m: movieDataList) {
            if (m.getAwards().equals("Yes")) {
                moviesWithAwards.add(m);
            }
        }
        String result = "";
        result += moviesWithAwards.size();
        result += " movies won an award";
        return result;
    }

    public static ArrayList<Movie> getFilter(char x, int n) {
        MovieFileReader.getData();
        ArrayList<Movie> movieDataList = MovieFileReader.getListOfMovies();
        ArrayList<Movie> filterList = new ArrayList<>();

        for (Movie m : movieDataList) {
            int xCount = 0;
            if (m.getTitle().contains("i")) {
                for (int i = 0; i < m.getTitle().length(); i++) {
                    if (m.getTitle().charAt(i) == x) {
                        xCount++;
                        if (xCount == n) {
                            filterList.add(m);
                        }
                    }
                }
            }
        }
        return filterList;
    }


    public static String genreWithLongestMovie(String genreOne, String genreTwo) {
        MovieFileReader.getData();
        ArrayList<Movie> movieDataList = MovieFileReader.getListOfMovies();
        ArrayList<Movie> genreOneList = new ArrayList<>();
        ArrayList<Movie> genreTwoList = new ArrayList<>();


        int genreOneTotalLength = 0;
        int genreTwoTotalLength = 0;
        int genreOneAverage = 0;
        int genreTwoAverage = 0;

        for (Movie m: movieDataList) {
            if (m.getSubject().toLowerCase().equals(genreOne.toLowerCase())) {
                genreOneList.add(m);
            } else if (m.getSubject().toLowerCase().equals(genreTwo.toLowerCase())) {
                genreTwoList.add((m));
            }
        }

        for (Movie m : genreOneList) {
            genreOneTotalLength += m.getLength();
        }

        for (Movie m : genreTwoList) {
            genreTwoTotalLength += m.getLength();
        }

        genreOneAverage = genreOneTotalLength / genreOneList.size();
        genreTwoAverage = genreTwoTotalLength / genreTwoList.size();

        String result = "";
        if (genreOneAverage > genreTwoAverage)
            result += genreOne + " has the longest avg length of " + genreOneAverage + " seconds";
        else
            result += genreTwo + " has the longest avg length of " + genreTwoAverage + " seconds";

        return result;
    }

}

