package com.codeup.basic.condition;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Study1066 {

	public static void main(String[] args) throws IOException {
		/** 정수 3개 입력받아 짝/홀 출력하기
		 * 세 정수 a, b, c가 입력되었을 때, 짝(even)/홀(odd)을 출력해보자.
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();

		String[] str = br.readLine().split(" ");
		
		for(int i = 0; i < 3; i++) {
			if(Integer.parseInt(str[i]) % 2 == 0) {
				sb.append("even\n");
			} else {
				sb.append("odd\n");
			}
		}
		
		bw.write(sb + "");
		bw.flush();
		bw.close();
		br.close();
	}

}
