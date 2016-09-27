package greetings;

import printing.Printer;

public class HelloWorld {
	
	public static void main(String[] args)
	{
		
		Printer myPrinter = new Printer(true,"MY PRINTER");
		
		myPrinter.loadPaper(3);
		myPrinter.print(4);
			
	}  

}
