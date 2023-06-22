package javapoint1;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetExample15 {
	  public static void main(String args[])   
	    {   
	        Set<Integer> data = new LinkedHashSet<Integer>();   
	        data.add(31);   
	        data.add(21);   
	        data.add(41);  
	        data.add(91);   
	        data.add(71);   
	        data.add(81);         
	        System.out.println("data: " + data);  
	  
	        Object[] array_data = data.toArray();   
	        System.out.println("The array is:");   
	        for (int i = 0; i < array_data.length; i++)   
	            System.out.println(array_data[i]);        
	    }   
}
