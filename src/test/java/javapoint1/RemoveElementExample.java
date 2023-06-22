package javapoint1;

import java.util.Dictionary;
import java.util.Hashtable;

public class RemoveElementExample {
	public static void main(String args[])  
	{  
	//creating a dictionary  
		Dictionary<Integer, String> dict = new Hashtable<Integer, String>();  
	//adding values in the dictionary  
	dict.put(101, "Sydney");  
	dict.put(108, "Canberra");  
	dict.put(106, "Mount Gambier");  
	dict.put(104, "Perth");  
	dict.put(102, "Brisbane");  
	//removes the corresponding value of the specified key  
	System.out.println("The removed value is: "+dict.remove(106));  
	}  
}
