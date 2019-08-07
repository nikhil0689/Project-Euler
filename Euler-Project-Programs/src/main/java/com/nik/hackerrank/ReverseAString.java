package com.nik.hackerrank;

import java.util.Arrays;

public class ReverseAString {

	public static void main(String[] args) {
		String s = "nikhil";
		System.out.println(reverse(s));

	}

	private static String reverse(String s) {
		char[] temp = s.toCharArray();
		int i = s.length()-1;
		int j = 0;
		
		while(j<i) {
			char tmp = s.charAt(j);
			temp[j] = temp[i];
			temp[i] = tmp;
			j++;
			i--;
		}
		return Arrays.toString(temp);
	}

}
