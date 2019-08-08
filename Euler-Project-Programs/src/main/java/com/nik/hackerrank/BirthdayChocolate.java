package com.nik.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class BirthdayChocolate {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		/*list.add(2);
		list.add(5);
		list.add(1);
		list.add(3);
		list.add(4);
		list.add(4);
		list.add(3);
		list.add(5);
		list.add(1);
		list.add(1);
		list.add(2);*/
		list.add(1);
		list.add(4);
		list.add(1);
		list.add(3);
		list.add(3);
		list.add(4);
		list.add(2);
		list.add(1);
		int sum = 18;
		int consecutiveNumbers = 7;
		int countOfPieces = getCount(list,sum,consecutiveNumbers);
		System.out.println(countOfPieces); //3
	}

	private static int getCount(List<Integer> list, int sum, int consecutiveNumbers) {
		int count = 0;
		if(consecutiveNumbers == 1) {
			return 1;
		}
		int sumVal = 0;
		for(int i=0;i<=list.size()-consecutiveNumbers;i++) {
			sumVal = 0;
			for (int j = i; j < i+consecutiveNumbers; j++) {
	            sumVal += list.get(j); 
	        }
			if(sumVal == sum) {
				count++;
			}
		}
		
		return count;
	}

}
