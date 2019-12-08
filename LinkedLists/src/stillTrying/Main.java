package stillTrying;

import java.util.*;
public class Main {
	  
	public static void main(String args[]) {

//Part 1
	System.out.println("part 1 of linkedList videos");	
		LinkedListAllParts random=new LinkedListAllParts("Rishabh", 54.96);
		System.out.println("balance for random "+random.getName()+" is "+random.getBalance());

		System.out.println("************");

		LinkedListAllParts random2; 
		random2=random; 
// up here java is assigning the second instance/class to point to the first instance/class
//Point to the same memory location, meaning same address. In other words
//saved the memory address in random2 and didn't created a new class/instance
		random2.setBalance(18.97);
/* when we used the set balance command, what that actually did was, it actually saved the 
 * value in this original location. So for all intents and purposes, there's only class here.
   Customer class is the first class, and another customer, the second one that we created, 
   is actually pointing to the first one.
 * 		
 */
		
		//just like arrays, this here is also reference(address) type. 
	
		System.out.println("balance for random "+random.getName()+" is "+random.getBalance());
		System.out.println("balance for random2 "+random2.getName()+" is "+random2.getBalance());
		
//Part2
	System.out.println("Part 2 of linkedList videos.");
	
	
	}

}
