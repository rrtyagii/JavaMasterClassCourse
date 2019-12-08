package cognitive;

public interface ConcreteLIst {
	 ListItem getRoot(); 
	 boolean addItem(ListItem item); 
	 boolean removeItem(ListItem item); 
	 void transverse(ListItem root); 
	   
}
