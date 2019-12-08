package com;

public class Main {
   public static void main(String args[]) {
	   Hamburger burger = new Hamburger("Italian", "Aloo Patty", 5, "Aloo ticcki");
	   
	   		burger.cheese(); 
	   		burger.tomato(); 
	   		burger.humus(); 
	   		System.out.println(burger.totalBurgerPrice()); 
   }
}
