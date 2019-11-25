package Parcourir;

import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;


public class HashMap_KeySet {
public static void main(String[] args) {
Map<Integer,String> myMap = new HashMap<Integer,String>();
myMap.put(19,"Mouna");
myMap.put(21,"Mostafa");
myMap.put(10,"Aya");

Set<Integer> setInt = myMap.keySet();
Iterator<Integer> it = setInt.iterator();

while(it.hasNext()) {
	int key =(Integer)it.next();
	System.out.println(key+" - "+myMap.get(key));
}
}
}
