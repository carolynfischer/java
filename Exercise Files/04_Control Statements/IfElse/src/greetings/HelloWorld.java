package greetings;

import printing.Printer;

public class HelloWorld {
	
	public static void main(String[] args)
	{
		//Printer myPrinter = new Printer(false,"MY PRINTER");
		
		Printer myPrinter = new Printer(true,"MY PRINTER");
		
		myPrinter.print();
		
		
		
	}  

}
