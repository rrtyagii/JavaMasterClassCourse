package com; 
public class DiagonalStar {
  public static void main(String[] args) {
	  
	  printSquareStar(8);
  }
  public static void printSquareStar(int number) {
     if(number<5) {
    	 System.out.println("Invalid Value");
     }
     else { 
    	 for (int y = 0; y < number; y++) {
    	  for (int x = 0; x < number; x++) {
    		  if(x==0 || x==number-1 || y==0 || y==number-1 || x==y || x == number-y-1) {
    		  System.out.print("*");
    		  } else System.out.print(" ");
          }
          System.out.println("");
      }
     }
  }
}
