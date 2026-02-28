/* Project: Lab3
 * Class: UniqueWords.java
 * Author: Ava Soric
 * Date: February 26th, 2026
 * This program counts the number of distinct elements in an
 * ArrayList<String> of different words.
 */

import java.util.ArrayList;

public class UniqueWords {
	/**
	 * counts the number of unique strings in a list
	 * 
	 * @param list ArrayList of strings to be examined
	 * @return number of unique strings in the list
	 */
	
	// ----------------------------------------------------------------
	// Compares all Strings to each other and only counts if unique
	public static int countUnique(ArrayList<String> list) {
		int count = 0;

		for (int i = 0; i < list.size(); i++) {
			boolean uniqueWord = true;

			for (int j = 0; j < i; j++) {
				if (list.get(i).equals(list.get(j))) {
					uniqueWord = false;
					break;
				}
			}
			if (uniqueWord) {
				count++;
			}
		}
		return count;
	}

	// ----------------------------------------------------------------
	// Creates a String ArrayList of words and uses countUnique
	// to determine the number of distinct, unique words
	public static void main(String[] args) {
		ArrayList<String> words = new ArrayList<>();
		words.add("apple");
		words.add("orange");
		words.add("blackboard");
		words.add("apple");
		words.add("orange");
		words.add("sun");
		words.add("moon");

		int unique = countUnique(words);
		System.out.println(words + " has " + unique + " unique words");
	}
}
