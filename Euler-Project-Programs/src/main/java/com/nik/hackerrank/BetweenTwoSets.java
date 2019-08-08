package com.nik.hackerrank;

import com.nik.euler.programs.utilities.Utilities;

public class BetweenTwoSets {

	public static void main(String[] args) {
		int[] a = {2,4};
		int[] b = {16,32,96};
		int noOfIntegersBwSets = getNumberOfIntegersBetweenSets(a,b);
		System.out.println(noOfIntegersBwSets);
	}

	private static int getNumberOfIntegersBetweenSets(int[] a, int[] b) {
		long lcm = 1;
		long gcd = b[0];
		for(int i=0;i<a.length;i++) {
			lcm = Utilities.getLCM(lcm, a[i]);
		}
		for(int i=1;i<b.length;i++) {
			gcd = Utilities.gcd(gcd, b[i]);
		}
		int count = 0;
		for(int i=1;i<=gcd;i++) {
			if(gcd%(i*lcm)==0) {
				count++;
			}
		}
		System.out.println(lcm);
		System.out.println(gcd);
		return count;
	}

}
