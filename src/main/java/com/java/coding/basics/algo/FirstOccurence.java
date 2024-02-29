package com.java.coding.basics.algo;

public class FirstOccurence {

	public static int strStr(String haystack, String needle) {
		int hayLength = haystack.length();
		int needLength = needle.length();

		for (int i = 0; i < hayLength; i++) {
			while (i < hayLength && haystack.charAt(i) != needle.charAt(0))
				i++;

			if (i < hayLength) {
				int start = i + 1;
				int needIndex = 1;

				while (start < hayLength && needIndex < needLength 
						&& haystack.charAt(start) == needle.charAt(needIndex)) {
					start++;
					needIndex++;
				}

				if (needIndex == needLength)
					return i;
			}
		}

		return -1;
	}

	public static void main(String[] args) {
		String haystack = "asadbutsad", needle = "sad";
		System.out.println(strStr(haystack, needle));
	}

}
