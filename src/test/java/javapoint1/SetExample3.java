package javapoint1;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetExample3 {
	public static void main(String args[])   
    {   
        Set<Integer> data = new LinkedHashSet<Integer>();   
        data.add(31);   
        data.add(21);   
        data.add(41);   
        data.add(11);   
        data.add(61);   
        data.add(51);   
        System.out.println("data: " + data);   
    }   

}
