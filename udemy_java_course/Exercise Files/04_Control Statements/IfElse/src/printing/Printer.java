package printing;

public class Printer {
	
	public boolean isOn;
	public String modelNumber;
	
	public Printer(boolean isOn, String modelNumber)
	{
		this.isOn = isOn;
		this.modelNumber = modelNumber;
	}

	public void print()
	{
		//System.out.println(isOn);
		//System.out.println(modelNumber);
		
		if(isOn)
		{
			System.out.println(modelNumber + " is On!");
		}
		else
		{
			System.out.println(modelNumber + " is Off!");
		}
	}
	
	public void print(String text)
	{
		System.out.println(text);
	}
	
	public String getModelNumber()
	{
		return modelNumber;
	}
}
