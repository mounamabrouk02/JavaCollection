package Parcourir;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayIterator {
     public static void main(String[] args) {
		System.out.println("Liste de type string :");
	
		List<String> listString = new ArrayList<String>();
		
		listString.add("Mostafa");
		listString.add("Hafsa");
		listString.add("Mouna");

		System.out.println("-------------Using iterator and remove :----------");
         Iterator<String>  it = listString.iterator();
         while(it.hasNext()) {
        	 String str = (String)it.next();
        	 if(str.equals("Hafsa")) 
        		 it.remove();
        	 else
        		 System.out.println(str);
		}
	}
}
