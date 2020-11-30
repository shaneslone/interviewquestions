// QUESTION: Check Permutation: Given two strings, write a method to decide if one is a permutation of the other.
package checkPermutation;

import java.util.HashMap;

public class Main {
	
	static boolean permutation(String string1, String string2){ // using hash map
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();

		if (string1.length() != string2.length()) return false;
		for(int i = 0; i < string1.length(); i++){
			char currentChar = string1.charAt(i);
			if(hm.get(currentChar) != null){
				int currentVal = hm.get(currentChar);
				hm.put(currentChar, currentVal + 1);
			} else {
				hm.put(currentChar, 1);
			}
		}
		for(int i = 0; i < string2.length(); i++){
			char currentChar = string2.charAt(i);
			if(hm.get(currentChar) != null){
				int nextVal = hm.get(currentChar) - 1;
				if(nextVal < 0){
					return false;
				} else {
					hm.put(currentChar, nextVal);
				}
			} else {
				return false;
			}
		}
		return true;
	}

	static boolean permutation2(String s, String t){ // using just an Array
		if(s.length() != t.length()) return false;

		int[] letters = new int[128];
		for(int i = 0; i < s.length(); i++){
			letters[s.charAt(i)]++;
		}
		for(int i = 0; i < t.length(); i++){
			letters[t.charAt(i)]--;
			if(letters[t.charAt(i)] < 0){
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args){
		System.out.println("---------HashMap Method------------");
		System.out.println(permutation("abc", "cba"));
		System.out.println(permutation("ab", "abcd"));
		System.out.println(permutation("efg", "abc"));
		System.out.println(permutation("!pppe0215", "ppp!e0512"));
		System.out.println(permutation("abc", "aaa"));
		System.out.println("---------Array Method------------");
		System.out.println(permutation2("abc", "cba"));
		System.out.println(permutation2("ab", "abcd"));
		System.out.println(permutation2("efg", "abc"));
		System.out.println(permutation2("!pppe0215", "ppp!e0512"));
		System.out.println(permutation2("abc", "aaa"));

	}
}