package com.java.coding.basics.algo;

import java.util.ArrayList;
import java.util.List;

public class PascalProb {
	public static List<List<Integer>> generate(int numRows) {

		List<List<Integer>> result = new ArrayList<List<Integer>>();
		for (int i = 0; i < numRows; i++) {
			List<Integer> temp = new ArrayList<Integer>();
			for (int j = 0; j < i + 1; j++) {
				if (j == 0 || j == i) {
					temp.add(1);
				} else {
					temp.add(result.get(i - 1).get(j - 1) + result.get(i - 1).get(j));
				}
			}
			result.add(temp);
		}
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println(generate(5));
	}

}
