package com.rays.basic;

public class PrimeNumber {
	public static void main(String[]args) {
		int num=331;
		int count=0;
		int i;
		int sum=0;
		for(i=2;i<num ;i++) {
		
		if(num%i==0) {
			count++;
			System.out.println("not a prime number");
			break;
			
		}
			
		}
		if(count==0) {
			System.out.println("prime number");
		}
		
	}

}
