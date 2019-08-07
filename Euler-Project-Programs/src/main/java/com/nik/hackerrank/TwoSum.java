package com.nik.hackerrank;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		int[] a = {2,3,7,4,8};
		int target = 11;
		int[] res = findTwoSum(a,target);
		System.out.println(Arrays.toString(res));
	}

	private static int[] findTwoSum(int[] a,int target) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int[] res = new int[2];
		for(int i=0;i<a.length;i++) {
			if(map.get(target-a[i])==null ) {
				map.put(a[i], i);
			}else {
				res[0] = map.get(target-a[i]);
				res[1] = i;
			}
		}
		return res;
	}

}
