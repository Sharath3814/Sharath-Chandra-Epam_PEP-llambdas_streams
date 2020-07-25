package com.epam.lambdas_streams;

public class CheckForPalindrome {	
	public static boolean check(String str) {
		return str.equals(new StringBuilder(str).reverse().toString());
	}
}

