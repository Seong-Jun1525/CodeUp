package com.codeup.basic.array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Study1430 {

	public static void main(String[] args) throws IOException {
		/**
		 * 주현이 엄마는 주현이를 영재로 키우기 위해 매일 혹독한 기억력 테스트를 하고 있다.
		 * N개의 숫자를 먼저 말해주고, M개의 질문을 하면서 그 숫자가 있었는지 없었는지 테스트한다.
		 * 만약 있었다면 1을 출력하고, 없었다면 0을 출력한다.
		 * 이번에는 주현이가 좋아하는 3단 합체 변신로봇 '또봇 트라이탄'이 선물로 걸려있다.
		 * 주현이를 도와 줄수 있는 프로그램을 만드시오.
		 * 
		 * 정답이긴 한데 메모리 초과로 통과가 x
		 * 자바 특성상 이 문제는 메모리 초과 발생하는 듯
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int count = 0;
		
		int n = Integer.parseInt(br.readLine());
		int[] nArr = new int[n];
		
		StringTokenizer stk = new StringTokenizer(br.readLine());
		for(int i = 0; i < nArr.length; i++) {
			nArr[i] = Integer.parseInt(stk.nextToken());
		}
		
		int m = Integer.parseInt(br.readLine());
		int[] mArr = new int[m];
		
		stk = new StringTokenizer(br.readLine());
		for(int i = 0; i < mArr.length; i++) {
			mArr[i] = Integer.parseInt(stk.nextToken());
		}
		
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < nArr.length; j++) {
				if(mArr[i] == nArr[j]) {
					count += 1;
					break;
				}
			}
			sb.append(count + " ");
			count = 0;
		}
		
		bw.write(sb +"\n");
		
		bw.flush();
		bw.close();
		br.close();
	}

}