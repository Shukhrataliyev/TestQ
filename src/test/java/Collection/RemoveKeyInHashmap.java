package Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class RemoveKeyInHashmap {

	public static void main(String[] args) {

//create an Hashmap object
		HashMap<String, String> hashmap = new HashMap();

//Add key values pairs to hashmap

		hashmap.put("1", "One");
		hashmap.put("2", "Two");
		hashmap.put("3", "Three");
		hashmap.put("4", "Four");
		hashmap.put("4", "Four");
		hashmap.put("5", "Five");
		hashmap.put("6", "Six");

		/*
		 * To remove a key value pair from HashMap use Object remove(Object key) method
		 * of HashMap class. It returns either the value mapped with the key or null if
		 * no value was mapped.
		 */

		Object object = hashmap.remove("5");
		System.out.println(object + " Removed from HashMap");
		
		System.out.println("hashmap- "+hashmap);

		if (!hashmap.isEmpty()) {

			Iterator it = hashmap.entrySet().iterator();

			while (it.hasNext()) {

				Map.Entry obj = (Entry) it.next();
				System.out.print(obj.getKey() + " ");
				System.out.println(obj.getValue());

			}
		}

	}

}