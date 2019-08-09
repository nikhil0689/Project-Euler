package com.nik.hackerrank;

import java.util.HashSet;
import java.util.Set;

public class TwoStrings {

	public static void main(String[] args) {
		String s1 = "hi";
		String s2 = "world";
		String val = hasCommonSubString(s1,s2);
		System.out.println(val);
	}

	private static String hasCommonSubString(String s1, String s2) {
		Set<Character> setA = new HashSet<>();
		Set<Character> setB = new HashSet<>();
		for(Character c: s1.toCharArray()) {
			setA.add(c);
		}
		for(Character c: s2.toCharArray()) {
			setB.add(c);
		}
		setA.retainAll(setB);
		return setA.isEmpty()?"NO":"YES";
	}

}
