package com.rays.basic;

public class Arr {
public static void main(String[]args) {
	int[]a= {6,4,6,8};
	int sum=0;
	for(int i=0; i<a.length; i++) {
		System.out.println(a[i]);
		sum=sum*a[i];
	}
	System.out.println("sum="+sum);
}
}