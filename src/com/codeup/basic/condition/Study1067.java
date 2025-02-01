package com.codeup.basic.condition;

import java.util.Scanner;

public class Study1067 {

	public static void main(String[] args) {
		/** 정수 1개 입력받아 분석하기
		 * 정수 1개가 입력되었을 때, 음(minus)/양(plus)과 짝(even)/홀(odd)을 출력해보자.
		 */
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n > 0) {
			System.out.println("plus");
		} else {
			System.out.println("minus");
		}
		
		if(n % 2 == 0) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}
	}

}
