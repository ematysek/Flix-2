package edu.ncsu.csc216.flix_2.inventory;

import java.util.Scanner;

public class Movie {

	private String name;
	
	private int inStock;
	
	public Movie(String line) {
		int numInStock;
		String movieTitle;		
		Scanner console = new Scanner(line);
		
		if (!console.hasNextInt()) {
			console.close();
			throw new IllegalArgumentException();
		}
		
		numInStock = console.nextInt();
		movieTitle = console.next();
		
		if (console.hasNext()) {
			console.close();
			throw new IllegalArgumentException();
		} else {
			console.close();
			name = movieTitle;
			inStock = numInStock;
		}
	}
	
	public String getName() {
		return name;
	}
	
	public String getDisplayName() {
		if (!isAvailable()) {
			return name + "currently unavailable";
		} else {
			return name;
		}
	}
	
	public int compareToByName(Movie movie) {
		int difference = 0;
		int i = 0;
		
		while (difference == 0) {
			difference = this.getName().charAt(i) - movie.getName().charAt(i);
			i++;
		}
		return difference;
	}
	
	public boolean isAvailable() {
		return inStock > 0;
	}
	
	public void backToInventory() {
		inStock++;
	}
	
	public void removeOneCopyFromInventory() {
		if (inStock == 0) {
			throw new IllegalArgumentException();
		} else {
			inStock--;
		}
	}
}
