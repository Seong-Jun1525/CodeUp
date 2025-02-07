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
