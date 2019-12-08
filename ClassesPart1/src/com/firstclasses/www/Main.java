package com.firstclasses.www;

public class Main {
	public static void main(String[] args) {
		Car mustang=new Car(); 
		Car maruti=new Car(); 
		
		mustang.setModel("2019FordMustang") ; 
		System.out.println("The model is "+ mustang.getModel() );
		maruti.setModel("Santro") ;
		System.out.println("The model is "+ maruti.getModel() );
		
	}
 
}
