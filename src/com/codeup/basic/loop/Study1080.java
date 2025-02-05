package com.codeup.basic.loop;

import java.util.Scanner;

public class Study1080 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int i = 1;
		int sum = 0;
		
		while(sum < n) {
			sum += i;
			i++;
		}

		System.out.println(--i);
		
		sc.close();
	}

}
