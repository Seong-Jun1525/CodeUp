package com.codeup.basic.sort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Study3014 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 현재 선택 정렬로 품 하지만 제한시간이 1s임. 그래서 퀵정렬로 바꿔야함.
		// TODO 퀵정렬로 바꾸자
		long startTimeM = System.currentTimeMillis(); // 코드 시작 시간. 밀리초
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		
		StringTokenizer stk = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(stk.nextToken());
		}
		
		int idx = 0;
		int temp = 0;
		for(int i = 0; i < n; i++) {
			int min = arr[i];
			for(int j = i; j < n; j++) {
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
		
		for(int i = 0; i < n; i++) {
			bw.write(arr[i] + " ");
		}
		
		long endTimeM = System.currentTimeMillis(); // 코드 끝난 시간
		long durationTimeSec = endTimeM - startTimeM;
		
		System.out.println(durationTimeSec + "m/s"); // 밀리세컨드 출력
		System.out.println((durationTimeSec / 1000) + "sec"); // 초 단위 변환 출력
		
		bw.flush();
		bw.close();
		br.close();

		
	}

}

//package com.codeup.basic.sort;
//
//import java.io.*;
//import java.util.*;
//
//public class Study3014 {
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        int n = Integer.parseInt(br.readLine());
//        int[] arr = new int[n];
//
//        StringTokenizer stk = new StringTokenizer(br.readLine());
//        for (int i = 0; i < n; i++) {
//            arr[i] = Integer.parseInt(stk.nextToken());
//        }
//
//        // 퀵 정렬 적용
//        quickSort(arr, 0, n - 1);
//
//        for (int i = 0; i < n; i++) {
//            bw.write(arr[i] + " ");
//        }
//        
//        bw.newLine();
//        bw.flush();
//        bw.close();
//        br.close();
//    }
//
//    // 퀵 정렬 (Lomuto Partition)
//    private static void quickSort(int[] arr, int low, int high) {
//        if (low < high) {
//            int pivotIndex = partition(arr, low, high);
//            quickSort(arr, low, pivotIndex - 1);
//            quickSort(arr, pivotIndex + 1, high);
//        }
//    }
//
//    private static int partition(int[] arr, int low, int high) {
//        int pivot = arr[high]; // 피벗을 배열의 마지막 원소로 설정
//        int i = low - 1;
//
//        for (int j = low; j < high; j++) {
//            if (arr[j] < pivot) {
//                i++;
//                swap(arr, i, j);
//            }
//        }
//        swap(arr, i + 1, high);
//        return i + 1;
//    }
//
//    private static void swap(int[] arr, int i, int j) {
//        int temp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;
//    }
//}
