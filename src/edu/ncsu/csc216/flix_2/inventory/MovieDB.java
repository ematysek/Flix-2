package edu.ncsu.csc216.flix_2.inventory;

import java.util.Scanner;
import edu.ncsu.csc216.flix_2.list_util.MultiPurposeList;

public class MovieDB {

	private MultiPurposeList<Movie> movies;
	
	public MovieDB(String file) {
		Scanner console = new Scanner(file);
		Movie movie;
		
		if (!console.hasNext()) {
			console.close();
			throw new IllegalArgumentException();
		} else {
			while(console.hasNextLine()) {
				String line = console.nextLine();
				movie = new Movie(line);
				int placeHolder = 0;
				movies.resetIterator();
				
				if (movies.size() == 0) {
					movies.addItem(0, movie);
				} else {
					while(movies.hasNext()) {
						Movie next = movies.next();
						int difference = movie.compareToByName(next);
						
						if (difference < 0) {
							movies.addItem(++placeHolder, movie);
							movies.moveAheadOne(placeHolder);
							break;
						} else {
							placeHolder++;
							
							if (placeHolder == movies.size()) {
								movies.addToRear(movie);
								break;
							}
						}
					}
				}
			}
		}
		
	}
	
	public String traverse() {
		
	}
	
	public Movie findItemAt(int index) {
		
	}
	
	private void readFromFile(String file) {
		
	}
	
	private void insertInOrder(Movie movie) {
		
	}
}
