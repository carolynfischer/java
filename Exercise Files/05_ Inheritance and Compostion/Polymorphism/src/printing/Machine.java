package printing;

public class Machine {
	
	protected boolean isOn;

	public Machine(boolean isOn)
	{
		this.isOn = isOn;
	}
	
	public void turnOn()
	{
		isOn = true;
		System.out.println("Machine is On!");
	}
	
	public void turnOff()
	{		
	    isOn = false;	
	}
	
	

}
