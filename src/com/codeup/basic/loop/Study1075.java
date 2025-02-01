package com.codeup.basic.loop;

import java.util.Scanner;

public class Study1075 {

	public static void main(String[] args) {
		/** 정수 1개 입력받아 카운트다운 출력하기2
		 * 정수(1 ~ 100) 1개가 입력되었을 때 카운트다운을 출력해보자.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = sc.nextInt() - 1; i >= 0; i--) {
			System.out.println(i);
		}
	}

}
