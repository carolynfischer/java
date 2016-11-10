package com.example.greetings;

public class HelloWorld {
	
	public static void main(String[] args)
	{
		/*String name ="John\nSmith";*/
		/*String name ="John \"Smith\" ";*/
		
		String firstName = "John ";
		String lastName = "Smith";
		
		String name = firstName + lastName;
		System.out.println(name);
		
		String phrase = "Hello,World.";
		/*System.out.println(phrase.length());
		System.out.println(phrase.toLowerCase());*/
		System.out.println(phrase.toUpperCase());
		
		String[] words = phrase.split(","); 
		System.out.println(words[0]);
		System.out.println(words[1]);
		
		/*System.out.println(phrase.indexOf("Wor"));*/
		/*System.out.println(phrase.indexOf("blue"));*/
		System.out.println(phrase.substring(0,5));
		
		String s1 = "Hello";
		String s2 = "hello";
		
		/*System.out.println(s1.equals(s2));*/
		System.out.println(s1.toLowerCase().equals(s2.toLowerCase()));
		
		String s3 = "aron";
		/*String s4 = "charlie";*/
		String s4 = "Charlie";
		
		System.out.println(s3.compareTo(s4));
		
		
		
	}  

}
