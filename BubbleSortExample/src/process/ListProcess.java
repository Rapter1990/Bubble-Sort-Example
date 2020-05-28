package process;

import java.util.ArrayList;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

import model.Movie;

public class ListProcess {
	
	private static final long INITIAL_VALUE = 1;
	private static AtomicLong atomicLong = new AtomicLong(INITIAL_VALUE);

	public static ArrayList<Movie> fillMovieList(ArrayList<Movie> movieList) {
		
		if(movieList == null) {
			movieList = new ArrayList<Movie>();
		}
		
		movieList = addMovies(movieList);
		
		return movieList;
	}


	private static ArrayList<Movie> addMovies(ArrayList<Movie> movieList) {
		
		for(int i=0;i<20;i++) {
			Movie movie = new Movie();
			movie.setId(defineMovieId());
			movie.setTitle(defineMovieName());
			movieList.add(movie);
		}		
		
		return movieList;
	}
	
	
	public static String defineMovieName() { 
		return UUID.randomUUID().toString().replace("-", "");
    } 
	
	public static long defineMovieId() {
		return atomicLong.getAndIncrement();
	}
}
