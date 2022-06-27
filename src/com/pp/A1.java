package com.pp;

public class A1 {
	

		public static void main(String[] args) {
			
			int a=123456;
			int b=0;
			while(a!=0) {
			int 	mod=a%10;
			b=b+mod;
			a=a/10;
			}
			System.out.println(b);
		}

	}



