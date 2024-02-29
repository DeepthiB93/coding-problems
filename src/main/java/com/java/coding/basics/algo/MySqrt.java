package com.java.coding.basics.algo;

import java.util.Arrays;

public class MySqrt {

	public static void main(String[] args) {
//		System.out.println(mySqrt(8));
		
		int nums1 [] = {1,2,3,0,0,0};
		int nums2 [] = {2,3,4};
		int m = 3;
		int n = 3;
		merge(nums1, m, nums2, n);
		
	}
	
	 public static int mySqrt(int x) {
	    return (int) Math.floor(Math.sqrt(x));
	 }
	 
	 public static void merge(int[] nums1, int m, int[] nums2, int n) {
		 int i = m - 1;
		 int j = n - 1;
		 int k = m + n -1;
 		 while(i >= 0 && j >= 0 ) {
			 if(nums1[i] > nums2[j]) {
				 nums1[k--] = nums1[i--];
			 } else {
				 nums1[k--] = nums2[j--];
				 
			 }
		 }
		 
		 while(j >= 0) {
			 nums1[k--] = nums2[j--];
		 }
	 }
}
