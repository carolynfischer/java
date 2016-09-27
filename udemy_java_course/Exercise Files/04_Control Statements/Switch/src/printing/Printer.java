package printing;

public class Printer {
	
	public boolean isOn;
	public String modelNumber;
	
	public Printer(boolean isOn, String modelNumber)
	{
		this.isOn = isOn;
		this.modelNumber = modelNumber;
	}

	public void print(int copies)
	{
		//System.out.println(isOn);
		//System.out.println(modelNumber);
		
		switch(copies)
		{
		case 0:			
			break;
		case 1:
		//case 5:	
			if(isOn)
			{
				System.out.println(modelNumber + " is On!");
			}
			else
			{
				System.out.println(modelNumber + " is Off!");
			}
			break;
		case 2:
			if(isOn)
			{
				System.out.println(modelNumber + " is On!");
				System.out.println(modelNumber + " is On!");
			}
			else
			{
				System.out.println(modelNumber + " is Off!");
				System.out.println(modelNumber + " is Off!");
			}
			break;	
		default :
			System.out.println("Number of copies is not supported!");
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
