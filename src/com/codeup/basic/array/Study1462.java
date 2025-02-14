package com.codeup.basic.array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Study1462 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= n; i++) {
			for(int j = i; j <= n * (n - 1) + i; j += n) {
				sb.append(j + " ");
			}
			sb.append("\n");
		}

		bw.write(sb + " ");
		bw.flush();
		bw.close();
		br.close();
	}

}
