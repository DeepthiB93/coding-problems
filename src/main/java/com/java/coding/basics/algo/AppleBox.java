package com.java.coding.basics.algo;

import java.util.Arrays;

public class AppleBox {
    public int minBoxes(int[] apple, int[] capacity) {
    	int sum = 0;
        for(int i=0;i<apple.length;i++){
            sum+=apple[i];
        }
        Arrays.sort(capacity);
        int boxesNeeded=0;
        for(int i=capacity.length-1;i>=0;i--){
            if(sum<=0){
                return boxesNeeded;
            }
            sum-=capacity[i];
            boxesNeeded++;
        }
        return boxesNeeded;
    }

    public static void main(String[] args) {
    	AppleBox solution = new AppleBox();
        int[] apples = {1, 3, 2}; // Example input
        int[] capacity = {4, 3, 1, 5, 2};  // Example input
        System.out.println(solution.minBoxes(apples, capacity)); // Output: 2
    }
}