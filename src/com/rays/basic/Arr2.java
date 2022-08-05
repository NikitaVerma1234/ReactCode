package com.rays.basic;

public class Arr2 {
public static void main(String[]args) {
	for(int i=0;i<args.length;i++) {
		String s=args[i];
		for(int j=0; j<s.length(); j++) {
			System.out.print(s.charAt(j));
		}
		//System.out.print(i);
	}
}
}
