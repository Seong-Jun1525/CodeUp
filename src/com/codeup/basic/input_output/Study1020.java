package com.codeup.basic.input_output;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Study1020 {

	public static void main(String[] args) throws IOException {
		/**
		 * 주민번호는 다음과 같이 구성된다.
		 * XXXXXX-XXXXXXX
		 * 앞의 6자리는 생년월일(yymmdd)이고 뒤 7자리는 성별, 지역, 오류검출코드이다.
		 * 주민번호를 입력받아 형태를 바꿔 출력해보자.
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer stk = new StringTokenizer(br.readLine(), "-");

		bw.write(stk.nextToken() + stk.nextToken() + "\n");
		
		bw.flush();
		bw.close();
		br.close();
	}

}
