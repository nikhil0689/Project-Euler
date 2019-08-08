package com.nik.hackerrank;

public class CountingValleys {

	public static void main(String[] args) {
		String s = "UDDDUUDDUU";
		int valleys = getValleys(s);
		System.out.println(valleys);
	}

	private static int getValleys(String s) {
		int level = 0;
		int valley = 0;
		for(Character c : s.toCharArray()) {
			if(c == 'U') {
				level++;
			}
			if(c=='D') {
				level--;
			}
			if(level == 0 && c == 'U') {
				valley++;
			}
		}
		
		return valley;
	}

}
