package com.vivek.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import com.vivek.model.Movie1;
import com.vivek.model.Movie2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

	@Autowired
	MoviesRepo moviesRepo;

//	private List<Movie1> movie1List=new ArrayList<>(Arrays.asList(
//			new Movie1("1","Captain America","https://www.google.com","-------"),
//			new Movie1("2","Iron Man","https://www.google.com/imgres","-------")
//	));
//	private List<Movie2> movie2List=new ArrayList<>(Arrays.asList(
//			new Movie2("1","Joney Depp","google.com/image/jonydepp","9"),
//			new Movie2("2","Joney Depp1","google.com/image/jonydeppgfdg","10"),
//			new Movie2("3","Joney Depp2","google.com/image/jonydep2","12"),
//			new Movie2("4","Joney Depp2","google.com/image/jonydep2","12")
//			));

	public List<Movie1> getAllMovie1List(){
		return moviesRepo.movie1List;
	}
	public List<Movie2> getAllMovie2List(){
		return moviesRepo.movie2List;
	}


	public List<Movie1> addmovies1(Movie1 movie1) {
		moviesRepo.movie1List.add(movie1);
		return moviesRepo.movie1List;
	}
	public List<Movie2> addmovies2(Movie2 movie2) {
		moviesRepo.movie2List.add(movie2);
		return moviesRepo.movie2List;
	}

	public Movie1 getmovie1(String id) throws Exception {
		Movie1 m1=null;
		for(Movie1 movie1: moviesRepo.movie1List){
			try{
				if (Objects.equals(movie1.getId(), id)){
					m1=movie1;
					break;
				}
				else
					return null;
			} catch (Exception e) {
				throw new Exception("ID NOT FOUND");
			}


		}
		return m1;

	}

	public void del1(String id) throws Exception {
		moviesRepo.movie1List.remove(getmovie1(id));
	}
}
