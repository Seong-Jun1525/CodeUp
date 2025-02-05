package com.codeup.basic.input_output;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Study1150 {
	
	public static void main(String[] args) throws IOException {
		// 가장 작은 수 출력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer stk = new StringTokenizer(br.readLine(), " ");
		
		int size = stk.countTokens();
		int min = Integer.parseInt(stk.nextToken());

		for(int i = 0; i < size - 1; i++) {
			int a = Integer.parseInt(stk.nextToken());
			if(min > a) {
				min = a;
			}
		}

		bw.write(min + "\n");
		
		bw.flush();
		bw.close();
		br.close();
	}

}
