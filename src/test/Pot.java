package test;

public class Pot extends Container {
	Pot (){
		
		currentQty=0;
		setState(PotState.empty);
	}
	
	void PotIsRemoved()
	{
		setState(PotState.warmerEmpty);
	}
	void PotIsAllocated()
	{
		setState(PotState.empty);
	}
}
