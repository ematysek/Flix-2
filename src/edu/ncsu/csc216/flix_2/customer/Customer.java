package edu.ncsu.csc216.flix_2.customer;

import edu.ncsu.csc216.flix_2.inventory.Movie;
import edu.ncsu.csc216.flix_2.list_util.MultiPurposeList;

public class Customer {

	private String id;

	private String password;

	private int maxAtHome;

	private int nowAtHome;

	private MultiPurposeList<Movie> atHomeQueue;

	private MultiPurposeList<Movie> reserveQueue;

	public Customer(String id, String password, int maxAtHome) {
		this.id = id;
		this.password = password;
		this.maxAtHome = maxAtHome;
	}

	public boolean verifyPassword(String password) {

	}

	public String getId() {
		return id;
	}

	public int compareToByName(Customer customer) {

	}

	public String traverseReserveQueue() {

	}

	public String traverseAtHomeQueue() {

	}

	public void closeAccount() {

	}

	public void returnDVD(int num) {

	}

	public void moveAheadOneInReserves(int num) {

	}

	public void unReserve(int num) {

	}

	public void reserve(Movie movie) {

	}

	private String traverseQueue(MultiPurposeList<Movie> list) {

	}

	private void checkOut() {

	}

	private Movie removeFirstAvailable() {

	}
}
