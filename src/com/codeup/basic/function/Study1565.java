package com.codeup.basic.function;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Study1565 {
	
	public static int gcd(int p, int q){ if(p==0) return q; return gcd(q%p, p);}
	
	public static long lcm(int n, int m) {
		
		return ((long)n * (long)m) / gcd(n, m);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer stk = new StringTokenizer(br.readLine(), " ");
		
		bw.write(lcm(Integer.parseInt(stk.nextToken()), Integer.parseInt(stk.nextToken())) + "\n");
		bw.flush();
		bw.close();
		br.close();
	}

}
