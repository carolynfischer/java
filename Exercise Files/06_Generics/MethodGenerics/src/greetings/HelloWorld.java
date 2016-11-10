package greetings;

import printing.ColorCartridge;
import printing.Printer;

public class HelloWorld {
	
	public static void main(String[] args)
	{
		
		Printer<ColorCartridge> printer = new Printer<ColorCartridge>(true,"MY PRINTER", new ColorCartridge());
				
		//printer.printUsingCartridge(new ColorCartridge(), "Hi!");
		
		//printer.printUsingCartridge(3, "Hi!");
		
		printer.printUsingCartridge(printer, "Hi!");
		
	}  

}
