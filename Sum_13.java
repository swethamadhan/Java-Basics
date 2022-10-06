package com.programs;
import java.util.Scanner;
public class Sum_13 {

	public static void main(String[] args) {
		int sum = 0, num;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		for(int i = 1 ; i <= num ; i++) {
			sum += i;
		}
		System.out.println(sum);
	}

}
