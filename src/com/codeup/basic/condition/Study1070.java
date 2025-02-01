package com.codeup.basic.condition;

import java.util.Scanner;

public class Study1070 {

	public static void main(String[] args) {
		/** 월 입력받아 계절 출력하기
		 * 월이 입력될 때 계절 이름이 출력되도록 해보자.
		 */
		
		Scanner sc = new Scanner(System.in);
		String season = "";
		switch(sc.nextInt()) {
			case 12: case 1: case 2: season = "winter"; break;
			case 3: case 4: case 5: season = "spring"; break;
			case 6: case 7: case 8: season = "summer"; break;
			case 9: case 10: case 11: season = "fall"; break;
		}
		
		System.out.println(season);
	}

}
