package com.codeup.basic.input_output;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Study1014 {

	public static void main(String[] args) throws IOException {
		/** 문자 2개 입력받아 순서 바꿔 출력하기
		 * 2개의 문자(ASCII CODE)를 입력받아서 순서를 바꿔 출력해보자.
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] str = br.readLine().split(" ");

		System.out.println(str[1].charAt(0) + " " + str[0].charAt(0));
		
		br.close();
	}

}
