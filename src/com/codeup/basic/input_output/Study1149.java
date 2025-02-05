package com.codeup.basic.input_output;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Study1149 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer stk = new StringTokenizer(br.readLine(), " ");
		
		bw.write(Math.max(Integer.parseInt(stk.nextToken()), Integer.parseInt(stk.nextToken())) + "\n");
		bw.flush();
		bw.close();
		br.close();
	}

}
