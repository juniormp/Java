package Collections.MapExample;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LinkedHashMapExample {

	public static void main(String[] args) {

		Map<Integer, Integer> linkedHashMap = new LinkedHashMap<>();

		// adding values
		linkedHashMap.put(1, 10);
		linkedHashMap.put(2, 20);
		linkedHashMap.put(3, 30);
		linkedHashMap.put(4, 40);
		linkedHashMap.put(5, 50);

		// Searching values with Enhanced-for
		for (Entry<Integer, Integer> entry : linkedHashMap.entrySet()) {
			System.out.println("Enhanced-for: " + entry.getKey() + " " + entry.getValue());
		}

	}

}
