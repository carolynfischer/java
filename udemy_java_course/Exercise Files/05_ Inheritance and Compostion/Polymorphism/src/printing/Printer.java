package printing;

public class Printer extends Machine{
	
	public String modelNumber;
	private PaperTray paperTray = new PaperTray();
	
	public Printer(boolean isOn, String modelNumber)
	{
		super(isOn);
		this.modelNumber = modelNumber;
	}
	
	@Override
	public void turnOn()
	{
		System.out.println("Warming up print engine");
		super.turnOn();		
	}

	public void print(int copies)
	{
		String onStatus = "";
		if(isOn)
			onStatus = " is On!";
		else
			onStatus = " is Off!";
			
		String textToPrint = modelNumber + onStatus ;
		//for(int i = 0; i < copies; i++)
		while(copies > 0 && ! paperTray.isEmpty())
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
				//break;
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
}
