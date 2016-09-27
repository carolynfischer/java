package greetings;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import printing.ColorCartridge;
import printing.Printer;

public class HelloWorld {
	
	public static void main(String[] args) 
	{
				
		Printer<ColorCartridge> printer  = new Printer<ColorCartridge>(true, "MY PRINTER", ColorCartridge.Red);
		
		printer.loadPaper(5);
		printer.print(3);
	
	}
	
}
