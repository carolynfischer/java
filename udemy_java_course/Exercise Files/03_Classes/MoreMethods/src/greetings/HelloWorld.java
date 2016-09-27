package greetings;

import printing.Printer;

public class HelloWorld {
	
	public static void main(String[] args)
	{
		Printer myPrinter = new Printer();
		myPrinter.isOn = false;
		myPrinter.modelNumber = "ABCD";
		
		Printer yourPrinter = new Printer();
		yourPrinter.isOn = true;
		yourPrinter.modelNumber = "FGH";
		
		//myPrinter.print("Hello Printer!");
		
		String theModelNumber = myPrinter.getModelNumber();
		System.out.println(theModelNumber);
	}  

}
