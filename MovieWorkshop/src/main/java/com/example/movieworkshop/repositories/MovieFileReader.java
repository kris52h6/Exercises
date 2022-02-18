package com.example.movieworkshop.repositories;

import com.example.movieworkshop.models.Movie;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class MovieFileReader {
    private static ArrayList<Movie> listOfMovies = new ArrayList<>();

    public static void getData() {
        File movieDataFile = new File("src/main/java/resources/imdb-data.csv");

        try {
            Scanner dataScanner = new Scanner(movieDataFile);
            dataScanner.nextLine();
            while(dataScanner.hasNext()) {
                String line = dataScanner.nextLine();
                String[] movieSplit = line.split(";");
                int movieYear = Integer.parseInt(movieSplit[0]);
                int movieLength = Integer.parseInt(movieSplit[1]);
                String movieTitle = movieSplit[2];
                String movieSubject = movieSplit[3];
                int moviePopularity = Integer.parseInt(movieSplit[4]);
                String movieHasAwards = movieSplit[5];

                Movie currentMovie = new Movie(movieYear, movieLength, movieTitle, movieSubject, moviePopularity, movieHasAwards);
                listOfMovies.add(currentMovie);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Movie> getListOfMovies() {
        return listOfMovies;
    }
}
