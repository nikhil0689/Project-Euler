package com.nik.euler.programs.problems;

import com.nik.euler.programs.utilities.Utilities;

public class P03_LargestPrimeFactor {

	public static void main(String[] args) {
		long n = 600851475143L;
		long largestPrimeFactor = getLargestPrimeFactor(n);
		System.out.println(largestPrimeFactor);
	}

	private static long getLargestPrimeFactor(long n) {
		long max = 0;
		for(long i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0 && Utilities.isPrime((int) i)){
				if(i>max) {
					max = i;
				}
			}
		}
		return max;
	}

}
