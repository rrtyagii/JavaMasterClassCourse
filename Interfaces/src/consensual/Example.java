package consensual;

import java.util.ArrayList;
import java.util.List;

public class Example implements ISaveable {
	private String exampleName, exampleType; 
	private boolean furtherExplanation=false;
	
	public Example(String exampleName, String ExampleType) {
		this.exampleName=exampleName; 
		this.exampleType=exampleType; 
	}
	
	
	

	/**
	 * @return the exampleName
	 */
	public String getExampleName() {
		return exampleName;
	}



	/**
	 * @param exampleName the exampleName to set
	 */
	public void setExampleName(String exampleName) {
		this.exampleName = exampleName;
	}



	/**
	 * @return the exampleType
	 */
	public String getExampleType() {
		return exampleType;
	}



	/**
	 * @param exampleType the exampleType to set
	 */
	public void setExampleType(String exampleType) {
		this.exampleType = exampleType;
	}



	/**
	 * @return the furtherExplanation
	 */
	public boolean isFurtherExplanation() {
		return furtherExplanation;
	}



	/**
	 * @param furtherExplanation the furtherExplanation to set
	 */
	public void setFurtherExplanation(boolean furtherExplanation) {
		this.furtherExplanation = furtherExplanation;
	}



	@Override
	public List<String> printArrayList() {
		// TODO Auto-generated method stub
		ArrayList<String> values = new ArrayList<String>(); 
		 
		return null; }

	@Override
	public void pass(List<String> arrList) {
		// TODO Auto-generated method stub
		
	}

	
	

}
