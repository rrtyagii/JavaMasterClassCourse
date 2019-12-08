package com;


public class MainForChecking  {
	
	public static void main(String[] args) {
		
		Inheritance inherit=new Inheritance("Inherit", 2500, 4, 7); 
		
		MainOfInheritance main=new MainOfInheritance(45000, true, false,59000, 5) ; 
		
		main.inherit();
		main.doesHe(false);
		main.doesHe(true); 
	}
	
}
