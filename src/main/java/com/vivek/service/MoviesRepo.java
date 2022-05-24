package com.vivek.service;

import com.vivek.model.Movie1;
import com.vivek.model.Movie2;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MoviesRepo {

//    List<Movie1> movie1List=new ArrayList<>(Arrays.asList(
//            new Movie1("1","Captain America","https://www.google.com","-------"),
//            new Movie1("2","Iron Man","https://www.google.com/imgres","-------")
//    ));
//    List<Movie2> movie2List=new ArrayList<>(Arrays.asList(
//            new Movie2("1","Joney Depp","google.com/image/jonydepp","9"),
//            new Movie2("2","Joney Depp1","google.com/image/jonydeppgfdg","10"),
//            new Movie2("3","Joney Depp2","google.com/image/jonydep2","12"),
//            new Movie2("4","Joney Depp2","google.com/image/jonydep2","12")
//    ));
    List<Movie1> movie1List=new ArrayList<>();
    List<Movie2> movie2List=new ArrayList<>();
    public MoviesRepo(){
        movie1List.add(new Movie1("1","Avengers Endgame","https://bit.ly/3sThnqF","2019"));
        movie1List.add(new Movie1("2","Iron Man 3","https://bit.ly/3GaMfbw","2013"));
        movie2List.add(new Movie2("1","Joney Depp","google.com/image/jonydepp","9"));
        movie2List.add(new Movie2("2","Chris Evan","google.com/image/jonydepp","9"));
    }



}
