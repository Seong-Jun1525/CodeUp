package com.codeup.basic.logical_operation;

import java.util.Scanner;

public class Study1057 {

	public static void main(String[] args) {
		/** 참/거짓이 서로 같을 때에만 참 출력하기
		 * 두 개의 참(1) 또는 거짓(0)이 입력될 때,
		 * 참/거짓이 서로 같을 때에만 참이 계산되는 프로그램을 작성해보자.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if((a == 1 && b == 1) || (a == 0 && b == 0)) System.out.println(1);
		else System.out.println(0);
		
		sc.close();
	}

}
