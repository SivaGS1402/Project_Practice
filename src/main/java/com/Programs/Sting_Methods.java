package com.Programs;

public class Sting_Methods {

	public static void main(String[] args) {

		String s = "Greens Technology";

		int length = s.length();
		System.out.println("Length of the string: " + length);

		String uppercaseString = s.toUpperCase();
		System.out.println("Uppercase: " + uppercaseString);

		String lowercaseString = s.toLowerCase();
		System.out.println("Lowercase: " + lowercaseString);

		String substring = s.substring(7);
		System.out.println("Substring from index 7: " + substring);

		String replacedString = s.replace('o', 'x');
		System.out.println("After replacing 'o' with 'x': " + replacedString);

		String newString = s.concat(" How are you?");
		System.out.println("Concatenated string: " + newString);

		boolean containsSubstring = s.contains("World");
		System.out.println("Does it contain 'Greens'? " + containsSubstring);

		int indexOfChar = s.indexOf('o');
		System.out.println("Index of 'o': " + indexOfChar);

		String stringWithWhitespaces = " Greens Technology ";
		String trimmedString = stringWithWhitespaces.trim();
		System.out.println("Trimmed string: '" + trimmedString + "'");

		String anotherString = "Hello, World!";
		boolean areEqual = s.equals(anotherString);
		System.out.println("Are the strings equal? " + areEqual);

		boolean startsWithHello = s.startsWith("Hello");
		System.out.println("Does it start with 'Hello'? " + startsWithHello);

		boolean endsWithWorld = s.endsWith("World!");
		System.out.println("Does it end with 'World!'? " + endsWithWorld);

		String[] words = s.split(", ");
		System.out.println("Split string:");
		for (String word : words) {
			System.out.println(word);
		}

		String emptyString = "";
		boolean isEmpty = emptyString.isEmpty();
		System.out.println("Is the string empty? " + isEmpty);

		String replacedMultiple = s.replaceAll("[GT]", "X");
		System.out.println("After replacing 'G' and 'T' with 'X': " + replacedMultiple);
		
		boolean contains = s.contains("Greesn");
		System.out.println("Does it contains word 'Greesn'? "+contains);
	}
}

