package com.codeup.basic.sort;

import java.util.Scanner;

public class Study1442 {

	public static void main(String[] args) {
		// 선택정렬 구현
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int idx = 0;
		int temp = 0;
		for(int i = 0; i < n; i++) {
			int min = arr[i];
			for(int j = i; j < n; j++) {
				if(min > arr[j]) {
					idx = j; // 가장 작은 값의 인덱스 번호
					min = arr[j]; // 가장 작은 값
				}
			}
			
			if(min != arr[i]) {
				temp = arr[i];
				arr[i] = arr[idx];
				arr[idx] = temp;
			}
		}
		
		for(int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
		
		sc.close();
	}

}
