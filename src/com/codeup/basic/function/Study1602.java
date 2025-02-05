package com.codeup.basic.function;

import java.util.Scanner;

public class Study1602 {

	public static void main(String[] args) {
		// 미해결
		Scanner sc = new Scanner(System.in);
		
		String[] strNum = sc.nextLine().split("\\.");
		
		if(strNum.length == 1) {
			// 정수값
//			String[] strNum2 = strNum[0].split("");
//			if(strNum2[0].equals("-")) {
//				
//			}
			System.out.println(Math.abs(Integer.parseInt(strNum[0])));
		} else {
			// 실수값
			double d = Double.parseDouble(strNum[0] + "." + strNum[1]);
			if(strNum[1].length() > 6) {
				System.out.printf("%.10g", Math.abs(d));
			} else {
				System.out.printf("%g", Math.abs(d));
			}
		}
		
//		if(d <= -1000000 || d >= 1000000) {
//			System.out.printf("%.10g", Math.abs(d));
//		} else {
//			System.out.printf("%f", Math.abs(d));
//		}
		
		sc.close();
	}

}
