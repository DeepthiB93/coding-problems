package com.java.coding.basics.algo;

import java.util.Arrays;

public class SelectionSort {
	
	public static int[] selectionSort(int arr[]) {
		int temp = 0;
		int latPosition = 0;
		
		for(int i = 0; i< arr.length -1 ; i++) {
			latPosition = i;
			for(int j = i+1; j < arr.length ; j++) {
				if(arr[latPosition] > arr[j]) {
					latPosition = j;
				}
			}
			temp = arr[latPosition];
			arr[latPosition] = arr[i];
			arr[i] = temp;
		}		
		return arr;
	}
	
	public static void main(String[] args) {
		int[] arr = {9, 20, 4, 1, 5, 6, 3, 2};
		System.out.println(Arrays.toString(selectionSort(arr)));
	}
}
