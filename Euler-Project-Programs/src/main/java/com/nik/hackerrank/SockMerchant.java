package com.nik.hackerrank;

import java.util.HashMap;
import java.util.Map;

public class SockMerchant {

	public static void main(String[] args) {
		int[] a = {1,2,1,2,1,3,2};
		int pairs = getPairs(a);
		System.out.println(pairs);

	}

	private static int getPairs(int[] a) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=0;i<a.length;i++) {
			if(map.get(a[i])==null) {
				map.put(a[i], 1);
			}else {
				map.put(a[i], map.get(a[i])+1);
			}
		}
		int count = 0;
		for(Integer val : map.values()) {
			count += val/2;
		}
		System.out.println(map);
		
		
		return count;
	}
	
}
