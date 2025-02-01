package com.codeup.basic.arithmetic_operations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Study1046 {

	public static void main(String[] args) throws IOException {
		/** 정수 3개 입력받아 합과 평균 출력하기
		 * 정수 3개를 입력받아 합과 평균을 출력해보자.
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] str = br.readLine().split(" ");
		int sum = 0;
		
		for(int i = 0; i < 3; i++) {
			sum += Integer.parseInt(str[i]);
		}
		
		System.out.printf("%d\n%.1f\n", sum, (double)sum / 3);
		
		br.close();
	}

}
