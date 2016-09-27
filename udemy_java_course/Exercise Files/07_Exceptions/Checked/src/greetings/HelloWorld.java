package greetings;

import java.io.File;
import java.io.IOException;

import printing.BWCartridge;
import printing.ColorCartridge;
import printing.ICartridge;
import printing.Printer;

public class HelloWorld {
	
	public static void main(String[] args) // throws  IOException
	{
				
		Printer<BWCartridge> printer  = new Printer<BWCartridge>(true, "MY PRINTER", new BWCartridge());
		
		File file = new File("D:\\test.txt");
		
		try 
		{
			file.createNewFile();
		} 
		catch (IOException e) 
		{
			//throw new PrinterException(e, "Other message");
		}
		
		try
		{
		printer.print(-1);
		}
		catch(IllegalArgumentException exception)
		{
			System.out.println(exception.getMessage());
			return;
		}
		finally
		{
			printer.turnOff();
		}
	}

}
