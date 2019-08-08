package com.nik.euler.programs.problems;

public class P02_EvenFibonacci {

	public static void main(String[] args) {
		int n = 4000000;
		long sum = getEvenFibonacciSum(n);
		System.out.println(sum);
	}

	private static long getEvenFibonacciSum(int n) {
		int a = 0;
		int b = 1;
		long sum = 0;
		int c = 0;
		while(c<n) {
			c = a+b;
			if(c%2==0) {
				sum += c;
			}
			a = b;
			b = c;
		}
		
		return sum;
	}

}
