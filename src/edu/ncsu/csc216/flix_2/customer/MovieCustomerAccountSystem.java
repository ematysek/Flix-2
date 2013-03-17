package edu.ncsu.csc216.flix_2.customer;

import edu.ncsu.csc216.flix_2.rental_system.RentalManager;

public class MovieCustomerAccountSystem implements CustomerAccountManager {

	private boolean adminLoggedIn;
	
	private boolean customerLoggedIn;
	
	public static final String ADMIN = "admin";
	
	private RentalManager inventorySystem;
	
	private CustomerDB customerList;
	
	public MovieCustomerAccountSystem(RentalManager inventorySystem) {
		this.inventorySystem = inventorySystem;
	}
	
	public void login(String id, String password) {
		
	}
	
	public void logout() {
		
	}
	
	public boolean isAdminLoggedIn() {
		
	}
	
	public boolean isCustomerLoggedIn() {
		
	}
	
	public void addNewCustomer(String id, String password, int maxAtHome) {
		
	}
	
	public void cancelAccount(String id) {
		
	}
	
	public String listAccounts() {
		
	}
}
