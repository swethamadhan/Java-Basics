package com.programs;

public class Fibo_16 {

	public static void main(String[] args) {
		int a = 0, b = 1, c = a+b;
		System.out.println(a);
		for(int i = 3 ; i <= 10 ; i++) {
			System.out.println(a);
			a = b;
			b = c;
			c = a+b;
		}
	}

}
