package com.java.coding.basics.algo;

public class ReverseBit {

	public static void main(String[] args) {
		int n = 1000;
		int res = 0;
        for(int i = 0; i<32; i++){
            res <<= 1;
            res += n%2;
            n >>>= 1;
        }
        System.out.println(res);
	}
}
