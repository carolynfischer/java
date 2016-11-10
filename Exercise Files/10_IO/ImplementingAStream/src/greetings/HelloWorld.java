package greetings;


import printing.ColorCartridge;
import printing.Printer;

public class HelloWorld {
	
	public static void main(String[] args) 
	{
				
		Printer<ColorCartridge> printer  = new Printer<ColorCartridge>(true, "MY PRINTER", ColorCartridge.Red);
		
		printer.loadPaper(5);
		printer.print(3);
		printer.outPutPage(1);
		
	}
	
}
