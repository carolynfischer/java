package greetings;

import printing.Printer;

public class HelloWorld {
	
	public static void main(String[] args)
	{
		Printer myPrinter = new Printer(true,"MY PRINTER");
		myPrinter.print();
		
		Printer yourPrinter = new Printer(false,"YOUR PRINTER");
		yourPrinter.print();
		
	}  

}
