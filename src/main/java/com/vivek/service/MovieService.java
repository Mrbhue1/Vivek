package com.vivek.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.vivek.model.Movie1;
import com.vivek.model.Movie2;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

	private List<Movie1> movie1List=new ArrayList<>(Arrays.asList(
			new Movie1("1","Captain America","https://www.google.com","-------"),
			new Movie1("2","Iron Man","https://www.google.com/imgres","-------")
	));
	private List<Movie2> movie2List=new ArrayList<>(Arrays.asList(
			new Movie2("1","Joney Depp","google.com/image/jonydepp","9"),
			new Movie2("2","Joney Depp1","google.com/image/jonydeppgfdg","10"),
			new Movie2("3","Joney Depp2","google.com/image/jonydep2","12"),
			new Movie2("4","Joney Depp2","google.com/image/jonydep2","12")
			));

	public List<Movie1> getAllMovie1List(){
		return movie1List;
	}
	public List<Movie2> getAllMovie2List(){
		return movie2List;
	}



	

}
