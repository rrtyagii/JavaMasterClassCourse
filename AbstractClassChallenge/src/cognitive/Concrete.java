package cognitive;

import java.util.*;

public class Concrete extends ListItem {
//      private boolean goingForward=false; 
	  private LinkedList<String> randomList=new LinkedList<String>(); 
	  
	public Concrete(Object value) {
		super(value);
	}
	
	
	@Override
	ListItem goingForward() {
		return this.nextItemLink; 
		// TODO Auto-generated method stub 
		
	}

	@Override
	ListItem setGoingForward(ListItem lisst) {
		
		this.nextItemLink=lisst; 
		// TODO Auto-generated method stub
		return this.nextItemLink;  
	}

	@Override
	ListItem goingBack() {
		
		// TODO Auto-generated method stub
		return this.previousItemLink;
		
	}

	@Override
	ListItem setGoingBack(ListItem item) {
		// TODO Auto-generated method stub
		return this.previousItemLink=item;
	}

	@Override
	int compareItems(ListItem item) {
		// TODO Auto-generated method stub
		if(item.equals(null)) {
		return 0; }
		else if(!item.equals(item)) {
			return ((String) super.getObjectValue()).compareTo((String)item.getObjectValue()); 
		}
		return -1; 
	}
// in tim's example it is Node class
}
