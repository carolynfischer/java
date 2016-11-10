package printing;


public class Printer implements IMachine{
	
	public String modelNumber;
	private PaperTray paperTray = new PaperTray();
	//private boolean isOn;
	private Machine machine;
	
	public Printer(boolean isOn, String modelNumber)
	{
		//this.isOn =  isOn;
		machine = new Machine(isOn);
		this.modelNumber = modelNumber;
	}
	
	@Override
	public void turnOn()
	{
		System.out.println("Warming up print engine");
		//isOn = true;	
		machine.turnOn();
	}

	public void print(int copies)
	{
		String onStatus = "";
		if(machine.isOn())
			onStatus = " is On!";
		else
			onStatus = " is Off!";
			
		String textToPrint = modelNumber + onStatus ;
		
		while(copies > 0 && !paperTray.isEmpty())
		{
			System.out.println(textToPrint);
			copies--;
			paperTray.usePage();
		}
		
		if(paperTray.isEmpty())
			System.out.println("Load more paper!");
	}
	
	public void printColors()
	{
		String[] colors = new String[] {"Red","Blue","Green","Yellow","Orange"};
		
		for(String currentColor : colors)
		{
			if("Green".equals(currentColor))
				continue;
			
			System.out.println(currentColor);
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

	public void loadPaper(int count)
	{
		paperTray.addPaper(count);
	}

	@Override
	public void turnOff()
	{
		//isOn = false;
		machine.turnOff();
	}

	@Override
	public boolean isOn() {
		return machine.isOn();
	}
}
