package com.java.coding.basics.algo;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
	
	public static boolean isHappy(int n) {
	    Set<Integer> set = new HashSet<>();

	    while (n!=1) {
	      if(set.contains(n)) return false;
	      
	      set.add(n);
	      n = sumOfDigitSquares(n);            
	    }	    
	    
	    return true;
	  }

	  private static int sumOfDigitSquares(int n) {
	    int sum = 0;
	    while (n != 0) {
	      int digit = n % 10; 
	      sum += digit * digit;
	      n /= 10;
	    }
	    
	    return sum;
	  }
	  
	  public static void main(String[] args) {
		System.out.println(isHappy(16));
	}


}
