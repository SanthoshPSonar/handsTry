package com.santhosh.service;

import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import com.santhosh.TO.MovieTO;
import com.santhosh.impl.MovieManager;
import com.santhosh.model.MovieRequest;
import com.santhosh.model.MovieResponse;

@Path("/")
@Produces({"application/xml","application/json"})
@Consumes({"application/xml","application/json"})
public class MovieService {

	
	private MovieManager movieManager;
	
	/**
	 * @return the movieManager
	 */
	public MovieManager getMovieManager() {
		return movieManager;
	}

	/**
	 * @param movieManager the movieManager to set
	 */
	public void setMovieManager(MovieManager movieManager) {
		this.movieManager = movieManager;
	}

	@GET
	@Path("/getMovie/{ID}")
	@Produces({"application/xml","application/json"})
	@Consumes({"application/xml","application/json"})
	public Response getMovie(@PathParam("ID") Integer movieID) {
		
		MovieResponse movieResponse = new MovieResponse();
		
		movieResponse.setMovies(Arrays.asList(movieManager.fetchMovieByID(movieID)));
		
		if(movieResponse == null) {
			return Response.status(Response.Status.BAD_REQUEST).build();
		}
		else {
			return Response.ok(movieResponse).build();
		}
		
	}
	
	@POST
	@Path("/addbook")
	@Produces({"application/xml","application/json"})
	@Consumes({"application/xml","application/json","application/x-www-form-urlencoded"})
	//public Response addBook(@FormParam("MovieName") String movieName ,@FormParam("Director") String director ) {
	  public Response addBook(MovieRequest movieRequest ) {
		
		MovieResponse movieResponse = new MovieResponse();
		
		movieManager.insertMovie(movieRequest.getMovieTO());

		
		if(movieRequest == null) {
			return Response.status(Response.Status.BAD_REQUEST).build();
		}
		else {
			return Response.ok(movieResponse).build();
		}
		
	}
	
}
