package javapoint1;

import java.util.Dictionary;
import java.util.Hashtable;

public class EmptyCheckExample {
	public static void main(String args[])  
	{  
	//creating a dictionary  
		Dictionary<Integer, String> dict = new Hashtable<Integer, String>();
	//adding values in the dictionary  
	dict.put(101, "Sydney");  
	dict.put(102, "Brisbane");  
	dict.put(103, "Melbourne");  
	dict.put(104, "Perth");  
	//checks if the dictionary is empty or not  
	System.out.println("Is the dictionary empty? \n"+dict.isEmpty());  
	}  
	}  

