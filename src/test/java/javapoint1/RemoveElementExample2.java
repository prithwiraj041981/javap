package javapoint1;

import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;

public class RemoveElementExample2 {
	public static void main(String args[])  
	{  
	//creating a dictionary  
		Dictionary<Integer, String> dict = new Hashtable<Integer, String>();  
	//adding values in the dictionary  
	dict.put(101, "Sydney");  
	dict.put(102, "Brisbane");  
	dict.put(103, "Melbourne");  
	dict.put(104, "Perth");  
	dict.put(105, "Lismore");  
	dict.put(106, "Mount Gambier");  
	dict.put(107, "Nelson Bay");  
	dict.put(108, "Canberra");  
	System.out.println("Dictionary values are: \n");  
	//loop iterate over the values stored in the dictionary  
	for(Enumeration enm = dict.elements(); enm.hasMoreElements();)  
	{  
	//prints the value      
	System.out.println(enm.nextElement());  
	}  
	System.out.println("\nDictionary keys are: \n");  
	//loop iterate over the keys stored in the dictionary  
	for(Enumeration enm = dict.keys(); enm.hasMoreElements();)  
	{  
	//prints the keys      
	System.out.println(enm.nextElement());  
	}  
	}  
}
