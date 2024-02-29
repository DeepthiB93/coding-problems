package com.java.coding.basics.algo;

public class MergeSort {
	public static void main(String args[]) {
		
		int arr[] = {8,3,6,2,1,7,5,4};
		mergeSort(arr);
		
		for(int i = 0; i< arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
	
	}
	
	public static void mergeSort(int arr[]) {
		
		int length = arr.length;
		if (length <= 1)
			return; 
		
		int mid = length/2;
		
		int [] leftArr = new int[mid];
		int [] rightArr = new int[length-mid];
		
		int i=0, j=0;
		for(; i < length; i++) {
			if(i< leftArr.length) {
				leftArr[i] = arr[i];
			} else {
				rightArr[j] = arr[i];
				j++;
			}
		}
		
		mergeSort(leftArr);
		mergeSort(rightArr);
		merge(leftArr, rightArr, arr);
		
	}
	
	public static void merge(int [] leftArr, int rightArr [], int [] arr) {
		int length = arr.length;
		int leftSize = length/2;
		int rightSize = length - leftSize;
		
		int l = 0, r= 0, i = 0;
		
		while(l<leftSize && r< rightSize) {
			if(leftArr[l] < rightArr[r]) {
				arr[i] = leftArr[l];
				i++;
				l++;
			} else {
				arr[i] = rightArr[r];
				i++;
				r++;
			}
		}
		
		while(l < leftSize) {
			arr[i] = leftArr[l];
			i++;
			l++;
		}
		
		while (r< rightSize) {
			arr[i] = rightArr[r];
			r++;
			i++;
		}
		
	}
}