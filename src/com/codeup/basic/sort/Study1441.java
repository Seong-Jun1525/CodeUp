package com.codeup.basic.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Study1441 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 버블 정렬
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		for(int i = 0; i < arr.length - 1; i++) { // 끝은 자동 정렬 되므로 끝까지 할 필요 없음
			for(int j = 0; j < arr.length - i - 1; j++) { // 끝에서 부터 정렬되므로 -1을 해서 하나씩 줄어들어야함
				if(arr[j] > arr[j + 1]) {
					int t = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = t;
				}
			}
		}
		
		for(int a : arr) {
			System.out.println(a);
		}
	}
}