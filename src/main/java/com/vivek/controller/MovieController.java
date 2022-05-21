package com.vivek.controller;


import com.vivek.model.Movie1;
import com.vivek.model.Movie2;
import com.vivek.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
