package bubblesort;

import model.Movie;

public class BubbleSortProcess {

	public static Movie[] bubbleSort(Movie[] movies) {
		
		for (int a = 1; a < movies.length; a++) {
			for (int b = 0; b < movies.length - a; b++) {
				if (((movies[b].getTitle()).compareTo((movies[b + 1].getTitle()))) > 0) {
					Movie temp = movies[b];
					movies[b] = movies[b + 1];
					movies[b + 1] = temp;
				}
			}
		}
		
		return movies;
	}
}
