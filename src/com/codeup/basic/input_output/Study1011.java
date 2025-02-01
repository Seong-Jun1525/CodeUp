package com.codeup.basic.input_output;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Study1011 {

	public static void main(String[] args) throws IOException {
		/** 문자 1개 입력받아 그대로 출력하기
		 * 문자형(char)으로 변수를 하나 선언하고, 변수에 문자를 저장한 후
		 * 변수에 저장되어 있는 문자를 그대로 출력해보자.
		 */

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		char c = br.readLine().charAt(0);
		
		sb.append(c);
		bw.write(sb + "\n");
		
		bw.flush();
		bw.close();
		br.close();
	}

}
