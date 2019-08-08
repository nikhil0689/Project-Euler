package com.nik.euler.programs.problems;

import com.nik.euler.programs.utilities.Utilities;

public class P05_SmallestMultiple {

	public static void main(String[] args) {
		int n = 20;
		long lcm = getLeastCommonMultiple(n);
		System.out.println(lcm);
	}

	private static long getLeastCommonMultiple(int n) {
		long lcm = 1;
		for(int i=1;i<=n;i++) {
			lcm = Utilities.getLCM(i,lcm);
		}
		return lcm;
	}

}
