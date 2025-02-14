package com.codeup.basic.array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Study1460 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= n * n; i++) {
			if(i != 1 && i % n == 0) sb.append(i + "\n");
			else sb.append(i + " ");
		}
		
		bw.write(sb + " ");
		bw.flush();
		bw.close();
		br.close();
	}

}
