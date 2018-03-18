package com.santhosh.model;

import java.util.List;

import com.santhosh.TO.MovieTO;

public class MovieResponse {
	
	private List<MovieTO> movies;
	private String errorMessage;
	private Boolean success = true;
	/**
	 * @return the movies
	 */
	public List<MovieTO> getMovies() {
		return movies;
	}
	/**
	 * @param movies the movies to set
	 */
	public void setMovies(List<MovieTO> movies) {
		this.movies = movies;
	}
	/**
	 * @return the errorMessage
	 */
	public String getErrorMessage() {
		return errorMessage;
	}
	/**
	 * @param errorMessage the errorMessage to set
	 */
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	/**
	 * @return the success
	 */
	public Boolean getSuccess() {
		return success;
	}
	/**
	 * @param success the success to set
	 */
	public void setSuccess(Boolean success) {
		this.success = success;
	}

	
	
	
}
