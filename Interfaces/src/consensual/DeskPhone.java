package consensual;

public class DeskPhone implements ITelephone {
	
	private int myNumber;
	private boolean isRinging;
	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("none action taken. just boot up man");
		
	}
	@Override
	public void dial(int phoneNumber) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void answer() {
		// TODO Auto-generated method stub
		System.out.println("Yeah I picked it up");
		isRinging=false; 
		
	}
	@Override
	public boolean callPhone(int phoneNumber) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean isRinging() {
		// TODO Auto-generated method stub
		return isRinging;
	} 
	
	

}
