package com.vivek.controller;


import com.vivek.model.Movie1;
import com.vivek.model.Movie2;
import com.vivek.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping("/movie1")
    public List<Movie1> getAllMovie1(){
        return movieService.getAllMovie1List();
    }
    @GetMapping("/movie2")
    public List<Movie2> getAllMovie2(){
        return movieService.getAllMovie2List();
    }
    @PostMapping("/add/movie1")
    public List<Movie1> addMovieToMovie1(@RequestBody Movie1 movie1){
        return movieService.addmovies1(movie1);
    }

    @PostMapping("/add/movie2")
    public List<Movie2> addDetailsToMovie2(@RequestBody Movie2 movie2){
        return movieService.addmovies2(movie2);
    }
   @GetMapping("/movie1/{id}")
    public Movie1 getMovieById(@PathVariable String id) throws Exception {
        return movieService.getmovie1(id);
   }
   @DeleteMapping("/delete/movie1/{id}")
    public String delMovieById(@PathVariable String id) throws Exception {
        movieService.del1(id);
        return "Deleted...";
   }


}
