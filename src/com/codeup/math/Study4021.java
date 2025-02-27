package com.codeup.math;

import java.util.Scanner;

public class Study4021 {

	public static void main(String[] args) {
		// 홀수의 합
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		
		for(int i = 0; i < 7; i++) {
			int x = sc.nextInt();
			
			sum += x % 2 != 0 ? x : 0;
		}
		
		if(sum > 0) System.out.println(sum);
		else System.out.println(-1);
		sc.close();
	}

}
