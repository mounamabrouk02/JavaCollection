package Parcourir;

import java.util.List;
import java.util.ArrayList;
public class ArrayBoucle {

	     public static void main(String[] args) {
			System.out.println("Liste de type string :");
		
			List<String> listString = new ArrayList<String>();
			
			listString.add("Mostafa");
			listString.add("Mouna");
			
			
			System.out.println("-------------Using simple boucle 1 :----------");	
	        for(int i=0;i<listString.size();i++) {
	        	System.out.println(listString.get(i));
	        }
	        
	        
			System.out.println("-------------Using simple boucle 2 :----------");		        
			for(String str : listString) {
			System.out.println(str);
		   }
	           }	
		           }


