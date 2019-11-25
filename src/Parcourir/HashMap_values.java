package Parcourir;

import java.util.Map;
import java.util.HashMap;
import java.util.Collection;
import java.util.Iterator;

public class HashMap_values {
public static void main(String[] args) {

	Map<Integer,String> myMap = new HashMap<Integer,String>();
	myMap.put(12,"Mohamed");
	myMap.put(15,"Morad");
	myMap.put(17,"Mostafa");
	myMap.put(19,"Monsif");
	
	Collection<String> col = myMap.values();
	Iterator<String> it = col.iterator();
	
	while(it.hasNext()) {
		String value = it.next();
		System.out.println("La valeur : "+value);
	}}}
