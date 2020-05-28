package main;

import java.util.ArrayList;
import java.util.Arrays;

import bubblesort.BubbleSortProcess;
import model.Movie;
import output.ShowProcess;
import process.ListProcess;

public class Main {

	static ArrayList<Movie> movieList;
	static ArrayList<Movie> sortedMovieList;
	
	public static void main(String[] args) {
		
		movieList = ListProcess.fillMovieList(movieList);
		
		System.out.println("BEFORE BUBBLESORT\n");
		ShowProcess.showMovieList(movieList);
		
		// Convert ArrayList to Array
		Movie[] movieArray = movieList.toArray(new Movie[movieList.size()]);
		
		movieArray = BubbleSortProcess.bubbleSort(movieArray);
		
		// Convert Array to ArrayList
		sortedMovieList = new ArrayList<>(Arrays.asList(movieArray));
		
		System.out.println("\nAFTER BUBBLESORT\n");
		ShowProcess.showMovieList(sortedMovieList);
	}
}
