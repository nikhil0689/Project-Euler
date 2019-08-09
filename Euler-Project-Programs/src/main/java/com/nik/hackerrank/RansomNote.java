package com.nik.hackerrank;

import java.util.Hashtable;

public class RansomNote {

	public static void main(String[] args) {
		String[] magazine = {"apgo", "clm", "w", "lxkvg", "mwz", "elo","bg","elo","lxkvg","elo","apgo","apgo","w","elo","bg"};
		String[] note = {"elo","lxkvg","bg","mwz","clm","w"};
		String possible = checkMagazine(magazine,note);
		System.out.println(possible);

	}

	private static String checkMagazine(String[] magazine, String[] note) {
		Hashtable<String, Integer> magazineTable = new Hashtable<>();
		for(String s: magazine) {
			if(magazineTable.containsKey(s)) {
				magazineTable.put(s,magazineTable.get(s)+1);
			}else {
				magazineTable.put(s, 1);
			}
		}
		System.out.println(magazineTable);
		Hashtable<String, Integer> noteTable = new Hashtable<>();
		for(String s: note) {
			if(noteTable.containsKey(s)) {
				noteTable.put(s,noteTable.get(s)+1);
			}else {
				noteTable.put(s, 1);
			}
		}
		System.out.println(noteTable);
		
		for(String s : noteTable.keySet()) {
			if(!noteTable.get(s).equals(magazineTable.get(s)) && 
					!(noteTable.get(s).compareTo(magazineTable.get(s)) <= 0)) {
				return "No";
			}
		}
		return "Yes";
	}

}
