package com.rays.basic;

public class String1 {
public static void main(String[]args) {
	
	String s="hello React Batch";
	char c='a';
	int count=0;
	for(int i=0; i<s.length();i++) {
		if(c==s.charAt(i)) {
			count++;
		}
	}
}
}
