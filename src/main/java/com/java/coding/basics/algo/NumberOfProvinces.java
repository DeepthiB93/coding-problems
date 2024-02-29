package com.java.coding.basics.algo;

public class NumberOfProvinces {
	
	public int findNum(int[][] isConnected) {
		int count = 0;
		int[] visited = new int[isConnected.length];
		for(int i = 0; i< isConnected.length; i++) {
			if(visited[i] == 0) {
				tracker(isConnected, visited, i);
				count++;
			}
		}
		
		return count;
	}
	
	public void tracker(int[][] isConnected, int[] visited, int i) {
		for(int j=0;j<isConnected.length; j++) {
			if(isConnected[i][j] == 1 && visited[j] == 0) {
				visited[j] = 1;
				tracker(isConnected, visited, j);
			}
		}
	}
	
	
	public static void main(String[] args) {
		NumberOfProvinces n = new NumberOfProvinces();
		//[[1,0,0],[0,1,0],[0,0,1]]  {{1,1,0},{1,1,0},{0,0,1}}
		int[][] isConnected = {{1,0,0},{0,1,0},{0,0,0}};
		System.out.println(n.findNum(isConnected)+"");
	}

}
