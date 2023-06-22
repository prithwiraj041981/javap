package javapoint1;

import java.util.Dictionary;
import java.util.Hashtable;

public class DictionaryGetElement {
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
	//gets the value of the specified key  
	System.out.println("The value of the specified key is: "+dict.get(103));  
	}  
}
