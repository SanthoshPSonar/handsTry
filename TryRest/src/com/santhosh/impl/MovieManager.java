package com.santhosh.impl;

import java.util.ArrayList;
import java.util.List;

import com.santhosh.TO.MovieTO;

public class MovieManager {
	
	private int nextID = 0;
	List<MovieTO> movies = new ArrayList<MovieTO>();
	
	public MovieTO fetchMovieByID(Integer ID) {
		
		for(MovieTO movie: movies) {
			if(movie.getMovieId() == ID) {
				return movie;
			}
		}
		
		throw new RuntimeException("movie not found" +ID);
	}
	
	public void insertMovie(MovieTO movie) {
		movie.setMovieId(nextID++);
		movies.add(movie);
	}

}
