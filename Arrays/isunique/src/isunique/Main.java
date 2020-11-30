// QUESTION: Is Unique: Implement an algorithm to determine if a string has all unique characters.

package isunique;

import java.util.HashMap;

public class Main {
	static boolean isUnique(String testString) { // Using hashmap
		HashMap<Character, Boolean> hm = new HashMap<Character, Boolean>();

			for(int i = 0; i < testString.length(); i++){
				if(hm.get(testString.charAt(i)) !=  null){
					return false;
				} else {
					hm.put(testString.charAt(i), true);
				}
			}
			return true;
		}

	static boolean isUniqueChars(String testString) { // Using just an array
		if(testString.length() > 128) return false;

		boolean[] char_set = new boolean[128];
		for (int i = 0; i < testString.length(); i++){
			int val = testString.charAt(i);
			if (char_set[val]){
				return false;
			}
			char_set[val] = true;
		}
		return true;
	}

	public static void main(String[] args)
	{
		System.out.println(isUnique("abcdefga"));
		System.out.println(isUniqueChars("abcdefga"));
	}
		
}