package com.nik.euler.programs.problems;

public class P01_MultiplesOf3And5 {
	
	public long getSum(int n) {
		long sum = 0;
		for(int i=1;i<n;i++) {
			if(i%3==0 && i%5==0) {
				sum += i;
			}
		}
		return sum;
	}

}
