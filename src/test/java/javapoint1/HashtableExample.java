package javapoint1;


import java.util.Hashtable;
import java.util.Map;





class boi {    
int id;    
String name,author,publisher;    
int quantity;    
public boi(int id, String name, String author, String publisher, int quantity) {
	 this.id = id;    
	    this.name = name;    
	    this.author = author;    
	    this.publisher = publisher;    
	    this.quantity = quantity;   
	
	// TODO Auto-generated constructor stub
}
   
}    
public class HashtableExample {
	public static void main(String[] args) {    
	    //Creating map of Books    
	    Map<Integer,boi> map=new Hashtable<Integer,boi>();    
	    //Creating Books    
	    boi b1=new boi(101,"Let us C","Yashwant Kanetkar","BPB",8);    
	    boi b2=new boi(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);    
	    boi b3=new boi(103,"Operating System","Galvin","Wiley",6);    
	    //Adding Books to map   
	    map.put(1,b1);  
	    map.put(2,b2);  
	    map.put(3,b3);      
	    //Traversing map  
	    for(Map.Entry<Integer, boi> entry:map.entrySet()){    
	        int key=entry.getKey();  
	        boi b=entry.getValue();  
	        System.out.println(key+" Details:");  
	        System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);   
	    }    
	}    

}
