package com.java.coding.basics.algo;

import java.util.ArrayList;

public class RemoveElement {
	public static int removeElement(int[] nums, int val) {
		ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                list.add(nums[i]);
            }
        }
        for(int i=0;i<list.size();i++){
            nums[i]= list.get(i);
        }
        return list.size();
	}
	
	public static void main(String[] args) {
		int n[] = {0,1,2,2,3,0,4,2};
		int val = 2;
		System.out.println(removeElement(n, val));
	}
}