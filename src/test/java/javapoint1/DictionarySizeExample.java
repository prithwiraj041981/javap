package javapoint1;

import java.util.Dictionary;
import java.util.Hashtable;

public class DictionarySizeExample {
	public static void main(String args[])  
	{  
	//creating a dictionary  
		Dictionary<Integer, String> dict = new Hashtable<Integer, String>(); 
	//adding values in the dictionary  
	dict.put(101, "Sydney");  
	dict.put(102, "Brisbane");  
	dict.put(103, "Melbourne");  
	dict.put(104, "Perth");  
	dict.put(107, "Nelson Bay");  
	dict.put(108, "Canberra");  
	//prints the size of the dictionary  
	System.out.println("The size of the dictionary is: "+dict.size());  
	}  
}
