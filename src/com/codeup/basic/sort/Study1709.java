package com.codeup.basic.sort;

import java.util.Scanner;

public class Study1709 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int idx = 0;
		int temp = 0;
		for(int i = 0; i < n; i++) {
			int max = arr[i];
			for(int j = i; j < n; j++) {
				if(max < arr[j]) {
					idx = j;
					max = arr[j]; 
				}
			}
			
			if(max != arr[i]) {
				temp = arr[i];
				arr[i] = arr[idx];
				arr[idx] = temp;
			}
		}
		
		for(int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		
		sc.close();

	}

}
