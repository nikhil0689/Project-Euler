package com.nik.euler.programs.utilities;

import org.springframework.stereotype.Component;

@Component
public final class Utilities {
	
	public static boolean isPrime(int n) {
		if (n < 2) {
			return false;
		}
        else if (n == 2) {
        	return true;
        }
		for(int i=2;i<Math.pow(n, 0.5);i++) {
			if (n % i == 0) {
                return false;
        	}  
		}
		return true;
	}

	public static boolean isPalindrome(String s) {
		return s.equals(new StringBuilder(s).reverse().toString());
	}

	public static long getLCM(long n1, long n2) {
		return n1*n2/gcd(n1,n2);
	}

	public static long gcd(long n1, long n2) {
		if(n1 == 0) {
			return n2;
		}
		return gcd(n2%n1,n1);
	}
	
	public static boolean isLeapYear(int year) {
		if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0)) {
			return true;
		}else {
			return false;
		}
		
		
	}

}
