package greetings;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import printing.BWCartridge;
import printing.Printer;

public class HelloWorld {
	
	public static void main(String[] args) 
	{
				
		Printer<BWCartridge> printer  = new Printer<BWCartridge>(true, "MY PRINTER", new BWCartridge());
		
	    Map<String, List<Integer>> testScores = new HashMap<String, List<Integer>>();
	    
	    List<Integer> JimmyScores = new ArrayList<Integer>();
	    JimmyScores.add(80);
	    JimmyScores.add(60);
	    JimmyScores.add(97);
	    testScores.put("Jimmy", JimmyScores);
		
	    List<Integer> JohnScores = new ArrayList<Integer>();
	    JohnScores.add(82);
	    JohnScores.add(98);
	    JohnScores.add(90);
	    JohnScores.add(99);
	    testScores.put("John", JohnScores);
	    
	    List<Integer> JackScore = new ArrayList<Integer>();
	    JackScore.add(50);
	    JackScore.add(60);
	    testScores.put("Jack", JackScore);
	    
	    printScores("Jack", testScores);
	}
	
	public static void printScores(String studentName, Map<String, List<Integer>> scoresMap)
	{
		List<Integer> scores = scoresMap.get(studentName);
		for(int score : scores)
		{
			System.out.println(score);
		}
	}

}
