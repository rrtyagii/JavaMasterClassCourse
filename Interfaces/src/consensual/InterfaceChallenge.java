package consensual;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InterfaceChallenge implements ISaveable {
   private String whatyoudoing; 
   private double timeWastedToday; 
   private boolean areYouGonnaDoThisEveryday; 
   private final String thinkAboutEntreprenuership="I will be an entreprenuer"; 
   private int justRandomIntDisplayer; 
   
   public InterfaceChallenge(String what, double timeWasted) {
	   this.whatyoudoing=what; 
	   this.timeWastedToday=timeWasted; 
	   System.out.println(thinkAboutEntreprenuership);
   }
   
   
		public String getWhatyoudoing() {
			return whatyoudoing;
		}
		
		
		public void setWhatyoudoing(String whatyoudoing) {
			this.whatyoudoing = whatyoudoing;
		}
		
		public double getTimeWastedToday() {
			return timeWastedToday;
		}
		
		public void setTimeWastedToday(double timeWastedToday) {
			this.timeWastedToday = timeWastedToday;
		}
		
		public boolean isAreYouGonnaDoThisEveryday() {
			return areYouGonnaDoThisEveryday;
		}
		
		public void setAreYouGonnaDoThisEveryday(boolean areYouGonnaDoThisEveryday) {
			this.areYouGonnaDoThisEveryday = areYouGonnaDoThisEveryday;
		}
		
		public String getThinkAboutEntreprenuership() {
			return thinkAboutEntreprenuership;
		}

		@Override
		public String toString() {
			return "InterfaceChallenge [whatyoudoing=" + whatyoudoing + ", timeWastedToday=" + timeWastedToday
					+ ", areYouGonnaDoThisEveryday=" + areYouGonnaDoThisEveryday + ", thinkAboutEntreprenuership="
					+ thinkAboutEntreprenuership + "]";
		}


		@Override
		public List<String> printArrayList() {
			// TODO Auto-generated method stub
			List<String> something= new ArrayList<String>(); 
			something.add(0, "Hello");
			something.add(1, "There");
			something.add(2, "I");
			something.add(3, "AM");
			something.add(4, "Rishabh");
			
		    return something; 	
		}


		@Override
		public void pass(List<String> arrList) {
			// TODO Auto-generated method stub
			if(arrList !=null && arrList.size()>0) {
				this.whatyoudoing=arrList.get(0); 
				this.justRandomIntDisplayer=Integer.parseInt(arrList.get(1)); 
			}
		}


	


	
	
	

}
