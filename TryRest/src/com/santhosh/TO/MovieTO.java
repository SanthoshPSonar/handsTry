package com.santhosh.TO;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;


public class MovieTO {

	/**
	 * @author Santhosh P Sonar
	 */
	private static final long serialVersionUID = 1L;
	
	private long movieId;
	private String movieName;
	private String director;
	
	public long getMovieId() {
		return movieId;
	}
	public void setMovieId(long movieId) {
		this.movieId = movieId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieNmae) {
		this.movieName = movieNmae;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	

}
