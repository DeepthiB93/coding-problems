package com.java.coding.basics.algo;

import java.util.Arrays;

public class BubbleSort {

	static public int[] bubbleSort(int arr[]) {
		int temp = 0;
		int count = arr.length;
		for (int i = 0; i < count - 1; i++) {
			for (int j = i + 1; j < count; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		int arr[] = { 4, 9, 12, 7, 8 };
		System.out.println(Arrays.toString(bubbleSort(arr)));
	}
}
