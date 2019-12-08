package com;

public class SimpleCalculator {

	 private double firstNumber, secondNumber; 
	 
	 public double getFirstNumber() {
		 return this.firstNumber; 
	 }
	 public double getSecondNumber() {
		 return this.secondNumber ; 
	 }
	 public void setFirstNumber(double firstNumber) {
		 this.firstNumber=firstNumber;
	 }
	 public void setSecondNumber(double secondNumber) {
		 this.secondNumber=secondNumber;
	 }
	 public double getAdditionalResult() {
		 return firstNumber+secondNumber; 
	 }
	 public double getSubtractionResult() {
		 return secondNumber-firstNumber; 
	 }
	 public double getMultiplicationResult() {
		 return firstNumber*secondNumber; 
	 }
	 public double getDivisionResult() {
		 if(secondNumber==0) {
			 return 0;
		 }
		 else {
		    return firstNumber/secondNumber;	 
		 }
		  
	 }
	 
	 
}
