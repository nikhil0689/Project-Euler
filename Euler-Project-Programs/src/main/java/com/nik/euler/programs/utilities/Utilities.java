package com.nik.euler.programs.utilities;

import org.springframework.stereotype.Component;

@Component
public class Utilities {
	
	public boolean isPrime(int n) {
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

}
