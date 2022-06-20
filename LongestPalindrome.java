package com.coding.palindrome;

import java.util.Scanner;

public class LongestPalindrome {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the String ");
		String inputString = scanner.nextLine();
		System.out.println("Longest Palindrome is : " + getLongestPalindrome(inputString));
		scanner.close();
	}

	public static String getLongestPalindrome(String inputString) {

		if (inputString.isEmpty()) {
			return "Enter proper String !";
		}
		if (inputString.length() == 1) {
			return inputString;
		}

		String longest = inputString.substring(0, 1);

		for (int i = 0; i < inputString.length(); i++) {

			String temp = checkEquality(inputString, i, i);
			if (longest.length() < temp.length()) {
				longest = temp;
			}

			temp = checkEquality(inputString, i, i + 1);
			if (longest.length() < temp.length()) {
				longest = temp;
			}

		}
		return longest;
	}

	public static String checkEquality(String inputString, int begin, int end) {
		while (begin >= 0 && end <= inputString.length() - 1 && inputString.charAt(begin) == inputString.charAt(end)) {
			begin--;
			end++;
		}
		return inputString.substring(begin + 1, end);
	}

}
