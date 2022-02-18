package com.example.movieworkshop.controllers;

import com.example.movieworkshop.models.Movie;
import com.example.movieworkshop.services.MovieServices;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class MovieController {

    @GetMapping("/")
    public String index() {
        return "Welcome to my movie database.";
    }

    @GetMapping("/getFirst")
    public Movie getFirst() {
        return MovieServices.getFirstMovie();
    }

    @GetMapping("/getRandom")
    public String getRandom() {
        return MovieServices.getRandomMovie();
    }

    @GetMapping("/getTenSortByPopularity")
    public ArrayList<Movie> getTenSortByPopularity() {
        return MovieServices.getTenSortByPopularity();
    }

    @GetMapping("howManyWonAnAward")
    public String howManyWonAnAward() {
        return MovieServices.getMoviesWithAwards();
    }

    // example: http://localhost:8080/filter?x=i&n=5
    @GetMapping("/filter")
    public ArrayList<Movie> filter(@RequestParam char x, @RequestParam int n) {
        return MovieServices.getFilter(x, n);
    }

    // example: http://localhost:8080/longest?g1=drama&g2=action
    @GetMapping("/longest")
    public String longestAverage(@RequestParam String g1, @RequestParam String g2) {
        return MovieServices.genreWithLongestMovie(g1, g2);
    }
}
