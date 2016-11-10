package printing;

public class ContinuousPrinter implements Runnable {

	private Printer<ICartridge> printer = new Printer<ICartridge>(true, "IPrint", ColorCartridge.Blue);

	@Override
	public void run() 
	{
	    for(int i=0; i<100; i++)
	    	printer.printUsingCartridge(ColorCartridge.Blue, "In Thread "+ i);
	    
	}
	
}
