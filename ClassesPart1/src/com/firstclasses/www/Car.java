package com.firstclasses.www;

public class Car  {
  
	private int doors;
	private int wheels;
	private String model;
	private String engine;
	private String colour;
	
  public void setModel(String model) {
	  String validModel=model.toLowerCase() ; 
	  if(validModel.equals("2019fordmustang") || validModel.equals("swift") ) {
		  this.model=model ; 
	              }
	  else {
		  this.model="Unknown!" ; 
	       }
     }
  public String getModel(){
	  return this.model ;  
     }

  
  
}
