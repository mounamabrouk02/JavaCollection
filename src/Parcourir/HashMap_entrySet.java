package Parcourir;

import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;
import java.util.Iterator;


public class HashMap_entrySet {
    public static void main(String[] args) {
    Map<Float,Double> myMap = new HashMap<Float,Double>();
    myMap.put(12.12F,12.1200002);
    myMap.put(16.16F,16.1600006);
    myMap.put(17.17F,17.1700007);
    myMap.put(19.19F,19.1900009);
    
    Set<Entry<Float,Double>> mySet = myMap.entrySet();
    Iterator<Entry<Float,Double>> it = mySet.iterator();
    while(it.hasNext()) {
       Entry<Float,Double> entry = it.next();
       System.out.println("La clé : "+entry.getKey()+" La valeur : "+entry.getValue());
    }
    
	}
}
