package week2.day1;

import java.util.Arrays;

public class AssignmentAnagram {
	public static void main(String[] args) {
		String text1 = "stops";
		String text2 = "potss";
		if (text1.length() == text2.length()) {
			char[] charArray1 = text1.toCharArray();
			char[] charArray2 = text2.toCharArray();
			Arrays.sort(charArray1);
			Arrays.sort(charArray2);
			System.out.println(charArray1);
			System.out.println(charArray2);
			Boolean A = Arrays.equals(charArray1, charArray2);
			if (A == true) {
				System.out.println("String 1 and 2 are anagram");
			} else
				System.out.println("String 1 and 2 are not anagram");
		} else
			System.out.println("Strings are not of same length");
	}
}
