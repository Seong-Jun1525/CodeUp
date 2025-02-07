package com.codeup.basic.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Study1172 {

	public static void main(String[] args) throws IOException {
		// 세 수 정렬하기
		int[] arr = new int[3];
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] strNum = br.readLine().split(" ");
		
		for(int i = 0; i < 3; i++) {
			arr[i] = Integer.parseInt(strNum[i]);
		}
		
		Arrays.sort(arr);
		
		for(int i = 0; i < 3; i++) {
			System.out.print(arr[i] + " ");
		}
		
		br.close();
	}

}
