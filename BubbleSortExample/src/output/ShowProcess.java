package output;

import java.util.ArrayList;

import model.Movie;

public class ShowProcess {

	public static void showMovieList(ArrayList<Movie> movieList) {
		System.out.println("All Movie list");
		if (movieList.size() > 0) {
			for (Movie movie : movieList) {
				if(movie == (movieList.get(movieList.size() - 1))) {
					System.out.println("Movie id : " + movie.getId() + " | Movie title : " + movie.getTitle());
				}else {
					System.out.println("Movie id : " + movie.getId() + " | Movie title : " + movie.getTitle());
					System.out.println("-----------------------------------");
				}
			}
		} else {
			System.out.println("Movie List is empty");
		}

	}
	
}
