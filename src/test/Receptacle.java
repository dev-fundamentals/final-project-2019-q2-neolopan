package test;

public class Receptacle {
	private boolean status;
	Receptacle(){
		//Closed
		status=false;
	}
	public void openFilter() {
		// TODO Auto-generated method stub
		status = true;
		System.out.println("Receptacle is open");
	}
	public void closeFilter() {
		// TODO Auto-generated method stub
		status = false;
		System.out.println("Receptacle is closed");
	}
	public boolean isOpen() {
		return status;
		}


}
