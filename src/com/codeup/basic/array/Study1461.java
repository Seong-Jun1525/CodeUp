package com.codeup.basic.array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Study1461 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		for(int j = 1; j <= n; j++) {
			for(int i = n * j; i > n * j - n; i--) {
				sb.append(i + " ");
			}
			sb.append("\n");
		}
		
		bw.write(sb + " ");
		bw.flush();
		bw.close();
		br.close();
	}

}
