package com.java.coding.basics.algo;

public class SingleNumber {
	
	public static void main(String[] args) {
		int num[] = {4,1,2,1,2};
		int result = 0;
		for(int i : num) {
			result = result ^ i;
			System.out.println(result);
		}
		System.out.println(result);
	}

}
