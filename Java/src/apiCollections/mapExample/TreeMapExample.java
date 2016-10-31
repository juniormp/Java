package apiCollections.mapExample;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {

		Map<Integer, Integer> treeMap = new TreeMap<>();

		// adding values
		treeMap.put(1, 10);
		treeMap.put(2, 20);
		treeMap.put(3, 30);
		treeMap.put(4, 40);
		treeMap.put(5, 50);

		// Searching values with Enhanced-for
		for (Entry<Integer, Integer> entry : treeMap.entrySet()) {
			System.out.println("Enhanced-for: " + entry.getKey() + " " + entry.getValue());
		}

	}

}
