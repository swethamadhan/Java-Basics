package com.programs;
import java.util.Scanner;

public class LCM_18 {

	private static final boolean True = false;

	public static void main(String[] args) {
		int num1, num2;
		Scanner sc = new Scanner(System.in);
		num1 = sc.nextInt(); num2 = sc.nextInt();
		int max;
		if(num1>num2) {
			max = num1;
		}
		else {
			max = num2;
		}
		
		for(int i = 1 ; i <= max ; i++,max++){
			if(max%num1 == 0 && max%num2 == 0) {
				System.out.println(max);
	            break;
			}
		}
	}
}
