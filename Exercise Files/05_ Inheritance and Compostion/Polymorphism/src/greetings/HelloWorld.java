package greetings;

import printing.Machine;
import printing.Printer;

public class HelloWorld {
	
	public static void main(String[] args)
	{
		
		Machine machine = new Printer(true,"MY PRINTER");
		//Machine machine = new Machine(false);
		
		machine.turnOn();
			
	}  

}
