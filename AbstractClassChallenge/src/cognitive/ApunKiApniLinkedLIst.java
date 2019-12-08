package cognitive; 

public class ApunKiApniLinkedLIst implements ConcreteLIst {
	/*	
	// The rules for adding an item to the linked list are:
//  If the head of the list is null, make the head refer to the item to be added.
//  If the item to be added is less than the current item in the list, add the item before
 *  the current item (i.e., make the previous item's "next" refer to the new item, and the 
 *  new item's "next" refer to the current item). If the item to be added is greater than 
 *  the current item, move onto the next item and compare again (if there is no next item 
 *  then that is where the new item belongs).
        // */
   private ListItem root = null; 
    
   public ApunKiApniLinkedLIst(ListItem root) {
    	this.root=root; 
    }
   
	@Override
	public ListItem getRoot() {
		// TODO Auto-generated method stub
		return this.root; 
	}

	@Override
	public boolean addItem(ListItem item) {
		// TODO Auto-generated method stub
		if(this.root==null) {
			//the list was empty, so this item become the head of the list
			this.root = item; 
			return true; 
		}
		ListItem currentItem=this.root;
		while(currentItem!=null) {
			
			int comparison=(currentItem.compareItems(item)); 
			if( comparison<0) {
				//new item is greater, move right if posible
				if(currentItem.goingForward()!=null) {
					currentItem= currentItem.goingForward(); 
					}
				else {
						// there is no next, so insert at the end of list
						currentItem.setGoingForward(item); 
						item.setGoingBack(currentItem); 
						//currentItem.setGoingForward(item).setGoingBack(currentItem)
						//would do the same thing as the above two lines.
						return true; 
					}
			}
			else if(comparison>0) {
				// item is less, insert before 
				if(currentItem.goingBack()!=null) {
					currentItem.goingBack().setGoingForward(item); 
					item.setGoingBack(currentItem.goingBack()); 
		//currentItem.goingBack().setGoingForward(item).setGoingBack(currentItem.goingBack());
		// would do the same as above two lines. 			
					item.setGoingForward(currentItem); 
					currentItem.setGoingBack(item); 
		//item.setGoingForward(currentItem).setGoingBack(item); 
		// would do the same as above two lines. 			
					
				} else {
				// the node with the previous is the root; 
			    item.setGoingForward(this.root); 
				this.root.setGoingBack(item) ; 
    // item.setGoingForward(this.root)..setGoingBack(item) ; 
	// would do the same as above two lines. 			
				this.root=item; 
			         }
				return true; 
		       }
			else {
				// equal
				System.out.println(item.getObjectValue() + " is already present, not added");
				return false; 
			} }		
		return false; }

	@Override
	public boolean removeItem(ListItem item) {
		// TODO Auto-generated method stub
		if(item!=null) {
			System.out.println("Deleting item "+item.getObjectValue());
		}
		
		ListItem currentItem=this.root; 
		while(currentItem!=null) {
			int comparison = currentItem.compareItems(item); 
			if(comparison== 0) {
				//found item to delete
				if(currentItem == this.root) {
					this.root=currentItem.goingForward(); 
				}else {
					currentItem.goingBack().setGoingForward(currentItem.goingForward());
					if(currentItem.goingForward()!=null) {
						currentItem.goingForward().setGoingBack(currentItem.goingBack());  
					} 
				}
				return true; 
			}
			else if(comparison<0) {
				currentItem=currentItem.goingForward(); 
			}
			else {
				//comparison = 0; we have passed the point we have to delete. 
				return false; 
			}
		}
		//we have reached the end of the list
		// without finding the item to delete. 
		return false; 
	}

	@Override
	public void transverse(ListItem root) {
		// TODO Auto-generated method stub
		if(root==null) {
			System.out.println("the list is empty");
		} else {
		while(root!=null) {
			System.out.println(root.getObjectValue());
			root=root.goingForward(); 
		} 
	  }
		
	 }

}
