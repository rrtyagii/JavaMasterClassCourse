package com;

public class ComplexNumber {
	// Instance Variable
	public double real, imaginary;

	//Constructor
	public ComplexNumber(double real, double imaginary) {
		super();
		this.real = real;
		this.imaginary = imaginary;
	}
	//Instance MEthods:
	//Getters:
	public double getReal() {
		return real; 
	}
	public double getImaginary() {
		return imaginary;
	}
	//Methods:
	public void add(double real, double imaginary) {
		this.real+=real;
		this.imaginary+=imaginary;
	}
	public void add(ComplexNumber con) {
		add(con.real, con.imaginary);
	}
	public void subtract(double real, double imaginary) {
		this.real-=real;
		this.imaginary-=imaginary;
	}

	public void subtract(ComplexNumber con) {
		subtract(con.real, con.imaginary);
	}
}
