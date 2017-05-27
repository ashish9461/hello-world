package learning;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		areAnagramsBySorting("     School Master  ", "The classroom");
		areAnagramsByIteration("Abc", "ca B");

	}

	public static void areAnagramsBySorting(String string1, String string2) {

		String temp1 = prepString(string1);
		String temp2 = prepString(string2);
		System.out.println(temp1);
		System.out.println(temp2);

		Boolean flag = true;

		if (temp1.length() != temp2.length())
			flag = false;

		temp1 = sort(temp1);
		temp2 = sort(temp2);
		
		System.out.println(temp1);
		System.out.println(temp2);

		flag = temp1.equals(temp2);

		if (flag)

			System.out.println(string1 + " and " + string2 + " are anagrams");

		else

			System.out.println(string1 + " and " + string2 + " are not anagrams");
	}

	public static void areAnagramsByIteration(String string1, String string2) {

	}

	protected static String prepString(String string) {

		return string.toLowerCase().replaceAll("\\s+", "");
	}

	protected static String sort(String string) {

		char[] charArray = string.toCharArray();
		Arrays.sort(charArray);
		return new String(charArray);
	}
}
