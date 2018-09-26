package JavaQ;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * * Java Program to find duplicate characters in String. * * * @author
 * http://java67.blogspot.com
 */
public class FindDuplicateCharMap {
	public static void main(String args[]) {

		String str = "aasf";
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		char[] arr = str.toCharArray();

		for (char value : arr) {

			if (Character.isAlphabetic(value)) {
				if (charMap.containsKey(value)) {
					charMap.put(value, charMap.get(value) + 1);

				} else {
					charMap.put(value, 1);
				}
			}
		}

		System.out.println(charMap);
	}
}
