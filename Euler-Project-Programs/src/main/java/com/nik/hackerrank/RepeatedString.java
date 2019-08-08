package com.nik.hackerrank;

public class RepeatedString {

	public static void main(String[] args) {
		String s = "abaa";
		long n = 10;
		long countOfa = getCount(s,n);
		System.out.println(countOfa);
	}

	private static long getCount(String s, long n) {
		long count = 0;
        long groups = n/s.length();
        long remElem = n - (groups*s.length());
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == 'a'){
                count++;
            }
        }
        count = count * groups;
        for(int j=0;j<remElem;j++){
            if(s.charAt(j) == 'a'){
                count++;
            }
        }
        return count;
	}

}
