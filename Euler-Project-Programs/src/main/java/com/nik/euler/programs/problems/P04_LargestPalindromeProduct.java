package com.nik.euler.programs.problems;

import com.nik.euler.programs.utilities.Utilities;

public class P04_LargestPalindromeProduct {

	public static void main(String[] args) {
		int n = 999;
		int largestPalindromicProduct = getLargestPalindromicProduct(n);
		System.out.println(largestPalindromicProduct);

	}

	private static int getLargestPalindromicProduct(int n) {
		int max = 0;
		for(int i=1;i<=n;i++) {
			for(int j=i+1;j<=n;j++) {
				int prd = i*j;
				if(Utilities.isPalindrome(String.valueOf(prd)) && prd> max) {
					max = prd;
				}
			}
		}
		return max;
	}

}
