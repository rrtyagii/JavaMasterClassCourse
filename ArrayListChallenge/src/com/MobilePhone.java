package com;

import java.util.*;

// Create a program that implements a simple mobile phone with the following capabilities.
// Able to store, modify, remove and query contact names.
// You will want to create a separate class for Contacts (name and phone number).
// Create a master class (MobilePhone) that holds the ArrayList of Contacts
// The MobilePhone class has the functionality listed above.
// Add a menu of options that are available.
// Options:  Quit, print list of contacts, add new contact, update existing contact, remove contact
// and search/find contact.
// When adding or updating be sure to check if the contact already exists (use name)
// Be sure not to expose the inner workings of the Arraylist to MobilePhone
// e.g. no ints, no .get(i) etc
// MobilePhone should do everything with Contact objects only.

public class MobilePhone {
//      private static Scanner scan = new Scanner (System.in); 
      
      private String myNumber; 
      private ArrayList<Contacts> myContact; 
      
      public MobilePhone(String myNumber) {
		super();
		this.myNumber = myNumber;
		this.myContact=new ArrayList<Contacts>();  
		
	}
	
	
	public boolean addNewContact(Contacts contact) {
		if(findContact(contact.getName())>=0) {
			System.out.println("Contact already exist");
			return false; 
		}
		myContact.add(contact); 
		return true; 
	}
	
	public boolean updateContact(Contacts old, Contacts newContact) {
		int foundPosition=findContact(old); 
		if(foundPosition<0) {
			System.out.println(old.getName()+" is not found ");
		    return false; 
		}
		this.myContact.set(foundPosition, newContact); 
		System.out.println(old.getName()+" was replaced with "+newContact.getName());
	    return true; 
	}
	
	public boolean queryContact(Contacts contact) {
		if(findContact(contact)>=0) {
			System.out.println(contact.getName()+" is found. ");
		    return true; 
		}
		return false;  
	}
	
	public Contacts queryContact(String name) {
		int position=findContact(name); 
		if(position>=0) {
			return this.myContact.get(position); 
		}
		return null; 
	}
	
	public boolean deleteContact(Contacts contact) {
		int foundPosition=findContact(contact); 
		if(foundPosition<0) {
		System.out.println(contact+" is not found! ");
		return false; 
		}
		this.myContact.remove(foundPosition); 
		System.out.println(contact.getName()+" was deleted. ");
		return true; 
	}
	public void printContacts() {
		System.out.println("Contact List");
		for(int i=0; i<this.myContact.size(); i++) {
			System.out.println( (i+1)+"."
					+" "+ this.myContact.get(i).getName()+" -> "
					+this.myContact.get(i).getNumber());
		}
	}
	
	private int findContact(Contacts contact) {
		return this.myContact.indexOf(contact); 
	}
	
	private int findContact(String contactName) {
		for(int i=0; i<this.myContact.size(); i++) {
			Contacts contact = this.myContact.get(i); 
			if(contact.getName().equals(contactName)) {
				return i; 
			}
		}
		return -1; 
	}
	
	 
	
      
      
      
      
}
