package com.nik.hackerrank;

public class JumpOnClouds {

	public static void main(String[] args) {
		int[] a = {0, 0 ,1, 0 ,0 ,1, 0};
		int jumps = getJumps(a);
		System.out.println(jumps);
	}

	private static int getJumps(int[] arr) {
		int count = 0;
		 int i = 0;
		 while(i < arr.length-1){
			 if(i+2 < arr.length && arr[i + 2] == 0){
				 i = i + 2;
				 count++;
			 }
			 else{
				 i++;
				 count++;
			 }
		 }
		 return (count);
	}

}
