 package com;
import java.util.*; 
public class Main {
	private static Scanner scan=new Scanner (System.in); 
	private static MobilePhone mobilePhone=new MobilePhone("773 733 6517"); 
	
	public static void main(String[] args) {
	
		boolean quit = false; 
		startPhone(); 
		printAction(); 
		while(!quit) {
			System.out.println("\nEnter action: (0 to show available actions)");
			int action = scan.nextInt(); 
			scan.nextLine(); 
			
			switch(action) {
			case 6: 
				System.out.println("\nSHUTTING DOWN");
				quit=true; 
				break; 
			case 0:
				printAction();
				break;
			case 1:
				mobilePhone.printContacts();
				break; 
			case 2:
				addNewContact(); 
				break; 
			case 3: 
				updateContact(); 
				break; 
			case 4:
				removeContact() ;
				break; 
			case 5: 
				queryContact();
				break; 
			}
		}
		
	}
	private static void addNewContact() {
		System.out.println("Enter new Contact Name:");
		String name=scan.nextLine(); 
		System.out.println("Enter phone number");
		String  phone=scan.nextLine(); 
		
		Contacts newContact=Contacts.createContact(name, phone); 
	    if(mobilePhone.addNewContact(newContact)) {
	    	System.out.println("new contact added: "+name+" Phone: "+phone);
	    }
	    else {
	    	System.out.println("cannot add, "+name+" already on the file.");
	    }
	}
	
	private static void updateContact() {
		   System.out.println("Enter the contact to be updated");
		   String name=scan.nextLine(); 
		   Contacts existingContact=mobilePhone.queryContact(name); 
		
		   if(existingContact==null) {
			   System.out.println("contact not found");
			   return; 
		   }
		   
		   System.out.println("Enter the name you want to replace it with?");
		   String repName=scan.nextLine();
		   System.out.println("enter new contact number");
		   String newNumber=scan.nextLine();
		   Contacts newContact= Contacts.createContact(repName, newNumber); 
	 
	      if (mobilePhone.updateContact(existingContact, newContact)) 
	         {
	    	  System.out.println("Successfully updated") ;
	          } 
	       else{
	    	  System.out.println("Error updating contact");
	      }
	}
		private static void removeContact() {
			   System.out.println("Enter the contact to be deleted");
			   String name=scan.nextLine(); 
			   Contacts existingContact=mobilePhone.queryContact(name); 
			   if(existingContact==null) {
				   System.out.println("contact not found");
				   return; 
			   }
			   
			   if(mobilePhone.deleteContact(existingContact)) {
				   
				   System.out.println("Successfully deleted") ;
		          } 
		       else{
		    	  System.out.println("Error deleting contact");
		      }
		}
		private static void queryContact() {
			 System.out.println("Enter the contact to be searched");
			   String name=scan.nextLine(); 
			   Contacts existingContact=mobilePhone.queryContact(name); 
			   if(existingContact==null) {
				   System.out.println("contact not found");
				   return; 
			   }
	System.out.println("Name: "+existingContact.getName() + "-> Phone: "+existingContact.getNumber());
	
		}
	
	private static void  startPhone( ){
		System.out.println("Starting PHone....");
	}
	private static void printAction() {
		System.out.println("\n Available Action:  \nPRESS");
	    System.out.println("\t 0 - TO PRINT THE AVAILABLE ACTIONS. ");
	    System.out.println("\t 1 - TO PRINT CONTACT LIST.");
	    System.out.println("\t 2 - TO ADD A CONTACT IN LIST ");
	    System.out.println("\t 3 - TO UPDATE A CONTACT FROM THE LIST. ");
	    System.out.println("\t 4 - TO REMOVE THE CONTACT FROM THE LIST. ");
	    System.out.println("\t 5 - TO SEARCH FOR A CONTACT IN THE LIST");
	    System.out.println("\t 6 - TO SHUTDOWN");
	    
	    System.out.println("Choose your actions\n");
	}
	
	

}
