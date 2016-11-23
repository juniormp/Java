package Collections.MapExample;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapExample {

	public static void main(String[] args) {

		Map<Integer, Integer> hashMap = new HashMap<>();

		// adding values
		hashMap.put(1, 10);
		hashMap.put(2, 20);
		hashMap.put(3, 30);
		hashMap.put(4, 40);
		hashMap.put(5, 50);

		// Searching values with Enhanced-for
		for (Entry<Integer, Integer> entry : hashMap.entrySet()) {
			System.out.println("Enhanced-for: " + entry.getKey() + " " + entry.getValue());
		}

	}

}
