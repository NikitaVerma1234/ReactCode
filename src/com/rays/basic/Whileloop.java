package com.rays.basic;
public class Whileloop{
	public static void main(String[]args) {
		boolean b=true;
		int i=1;
		while(b) {
			System.out.println(	i+" hello");
			i++;
			if(i>100) {
			b=false;	
			}
		}
				
	}
}