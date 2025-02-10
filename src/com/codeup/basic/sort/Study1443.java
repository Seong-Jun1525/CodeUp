package com.codeup.basic.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Study1443 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 버블 정렬
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		int i, j;
		
		// 현재 정렬된 배열은 i-1까지이므로 i-1번째부터 역순으로 조사한다.
	    // j 값은 음수가 아니어야 되고
	    // key 값보다 정렬된 배열에 있는 값이 크면 j번째를 j+1번째로 이동
		for(i = 1; i < arr.length; i++) {
			int key = arr[i];
			for(j = i - 1; j >= 0 && arr[j] > key; j--) {
				arr[j + 1] = arr[j]; // 레코드의 오른쪽으로 이동
			}
			arr[j + 1] = key;
		}
		
		for(int a : arr) {
			System.out.println(a);
		}
	}

}
