package com.codeup.sort;

import java.util.Scanner;

public class Study4501 {

	public static void main(String[] args) {
		// 백설공주와 난쟁이
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[7];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		// 선택정렬 연습해보기!
		int temp = 0;
		int idx = 0;
		for(int i = 0; i < arr.length; i++) {
			int min = arr[i];
			for(int j = i; j < arr.length; j++) {
				if(min > arr[j]) {
					idx = j;
					min = arr[j];
				}
			}
			if(min != arr[i]) {
				temp = arr[i];
				arr[i] = arr[idx];
				arr[idx] = temp;
			}
			
		}
		
		System.out.println(arr[arr.length-1]);
		System.out.println(arr[arr.length-2]);
		sc.close();
	}

}
