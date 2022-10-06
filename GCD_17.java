package com.programs;
import java.util.Scanner;
public class GCD_17 {

	public static void main(String[] args) {
		int num1, num2, i, gcd = 0;
		Scanner sc = new Scanner(System.in);
		num1 = sc.nextInt(); num2 = sc.nextInt();
		for( i = 1 ; i <= num1 && i <= num2 ; i++) {
			if(num1%i == 0 && num2%i == 0)
	            gcd = i;
		}
		System.out.println(gcd);
	}
}
