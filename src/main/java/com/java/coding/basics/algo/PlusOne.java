package com.java.coding.basics.algo;

import java.math.BigInteger;
import java.util.Arrays;

public class PlusOne {
	
	public static int[] plusOne(int[] digits) {
		
		BigInteger num = BigInteger.ZERO;
		
		for(int i = 0; i< digits.length; i++)
			num = num.multiply(BigInteger.TEN).add(BigInteger.valueOf(digits[i]));
		
		num = num.add(BigInteger.ONE);
		String str = num.toString();
		
		digits = str.length() == digits.length ? digits : new int[str.length()];
		
		for(int i = 0 ; i<digits.length ; i++) {
			digits[i] = str.charAt(i) - '0';
		}
	    return digits;
	}

	public static void main(String[] args) {
		int[] digits = {9,9,9};
		System.out.println(Arrays.toString(plusOne(digits)));
	}
}
