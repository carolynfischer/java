package greetings;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import printing.BWCartridge;
import printing.ColorCartridge;
import printing.Printer;

public class HelloWorld {
	
	public static void main(String[] args) 
	{
				
		Printer<ColorCartridge> printer  = new Printer<ColorCartridge>(true, "MY PRINTER", ColorCartridge.Red);
		
		switch(printer.getCartridge())
		{
		case Blue:
			System.out.println("Blue");
			break;
		case Red:
			System.out.println("Red");
			break;
		case Green:
			System.out.println("Green");
			break;
		case Yellow:
			System.out.println("Green");
			break;
		}
	}
	
}
