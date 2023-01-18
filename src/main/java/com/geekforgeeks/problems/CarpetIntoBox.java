package com.geekforgeeks.problems;

/*
 * There is a carpet of a size a*b [length * breadth]. You are given a box of size c*d. 
 * The task is, one has to fit the carpet in the box in a minimum number of moves.
 */
public class CarpetIntoBox {

	int carpetBox(int A, int B, int C, int D) { 
        //code here
        
        int a = 0, b = 0, c= 0, d = 0;
        
        while(A>C || A>D) {
            if(A>C) {
                a++;
            }
            if(A>D) {
                b++;
            }
            A = A/2;
        }
        
        while(B>C || B>D) {
            if(B>C) {
                c++;
            }
            if(B>D) {
                d++;
            }
            B = B/2;
        }
        
        return Math.min(a+d, b+c);
    }
	
}
