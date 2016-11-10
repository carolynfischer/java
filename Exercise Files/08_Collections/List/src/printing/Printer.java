package printing;

import java.util.ArrayList;
import java.util.List;


public class Printer<T> implements IMachine{
	
	public String modelNumber;
	private PaperTray paperTray = new PaperTray();
    private Machine machine;
    private T cartridge;
    private List<Page> pages =  new ArrayList<Page>();
    
	
	public Printer(boolean isOn, String modelNumber, T cartridge)
	{
		machine = new Machine(isOn);
		this.modelNumber = modelNumber;
		this.cartridge = cartridge;
	}
	
	@Override
	public void turnOn()
	{
		System.out.println("Warming up print engine");
		machine.turnOn();
	}

	public <U extends ICartridge> void printUsingCartridge(U cartridge, String message)
	{
		System.out.println(cartridge.toString());
		System.out.println(message);
		System.out.println(cartridge.toString());
	}
	
	public void print(int copies)
	{
		//checkCopies(copies);
		
		String onStatus = "";
		if(machine.isOn())
			onStatus = " is On!";
		else
			onStatus = " is Off!";
			
		String textToPrint = modelNumber + onStatus ;
		
		while(copies > 0 && !paperTray.isEmpty())
		{
			//System.out.println(textToPrint);
			pages.add(new Page(textToPrint));
			
			copies--;
			paperTray.usePage();
		}
		
		if(paperTray.isEmpty())
			System.out.println("Load more paper!");
	}

	public void outPutPage()
	{
		for(Page currentPage : pages)
		{
			System.out.println(currentPage.getText());
		}
	}
	
	private void checkCopies(int copies) {
		if(copies < 0)
			throw new IllegalArgumentException("Can't print less than 0 copies.");
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
	
	public T getCartridge()
	{
		return cartridge;
	}

	@Override
	public void turnOff()
	{    
		machine.turnOff();
	}

	@Override
	public boolean isOn() {
		return machine.isOn();
	}
}
