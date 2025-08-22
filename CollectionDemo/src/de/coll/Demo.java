package de.coll;


import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import de.ruv.tiere.Schwein;

public class Demo {

	public static void main(String[] args) {
		
	
		
		Set<Schwein> strings = new TreeSet<>();
		strings.add(new Schwein("Eins", 20));
		strings.add(new Schwein("Eins", 10));
		strings.add(new Schwein("Zwei", 40));
		strings.add(new Schwein("Drei",3));
		strings.add(new Schwein("Vier",5));
		
		for (Schwein schwein : strings) {
			//System.out.println(schwein);
		}
		
		Map<String, Schwein> myMap = new HashMap<>();
		myMap.put("piggy", new Schwein("Miss Piggy", 10));
		myMap.put("babe", new Schwein("Babe", 15));
		myMap.put("babe", new Schwein("Babe", 150));
		Schwein result = myMap.getOrDefault("babe", new Schwein());
		
		System.out.println(result);
		Set<String> keys= myMap.keySet();
		
		myMap.forEach((string, schwein)->System.out.println(string + " " + schwein));

	}

}
