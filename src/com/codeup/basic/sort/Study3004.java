package com.codeup.basic.sort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class MyArrayInfo {
	private int idx;
	private int value;
	
	public MyArrayInfo() {}
	
	public MyArrayInfo(int idx, int value) {
		super();
		this.idx = idx;
		this.value = value;
	}

	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
}

public class Study3004 {
	// 데이터 입력받기
	// 입력받은 크기만큼 배열 생성
	// 배열의 크기만큼 해당 배열에 값 넣기

	// 배열 오름차순 정렬하기

	// 기존 배열을 정렬된 배열이랑 비교해서
	// 비교했을 때 인덱스 값을 출력
	
	// 메모리 줄이기 위해 Scanner => Bufferd 로 변경

	public static void main(String[] args) throws NumberFormatException, IOException {
//		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
//		int n = sc.nextInt();
		
		MyArrayInfo[] myArrInfo = new MyArrayInfo[Integer.parseInt(br.readLine())];

		StringTokenizer stk = new StringTokenizer(br.readLine());
		for(int i = 0; i < myArrInfo.length; i++) {
			myArrInfo[i] = new MyArrayInfo(i, Integer.parseInt(stk.nextToken()));
		}
		
		MyArrayInfo[] copy = new MyArrayInfo[myArrInfo.length];
		
		for(int i = 0; i < myArrInfo.length; i++) {
			copy[i] = myArrInfo[i];
		}
		
		// 선택정렬
		int idx = 0;
		MyArrayInfo temp = null;
		
		for(int i = 0; i < myArrInfo.length; i++) {
			MyArrayInfo min = myArrInfo[i];
			for(int j = i; j < myArrInfo.length; j++) {
				if(min.getValue() > myArrInfo[j].getValue()) {
					idx = j; // 가장 작은 값의 인덱스 번호
					min = myArrInfo[j]; // 가장 작은 값
				}
			}
			if(min.getIdx() != myArrInfo[i].getIdx()) {
				temp = myArrInfo[i];
				myArrInfo[i] = myArrInfo[idx];
				myArrInfo[idx] = temp;
			}
		}
		
		for(int i = 0; i < copy.length; i++) {
			for(int j = 0; j < myArrInfo.length; j++) {
//				System.out.println("=> " + copy[i].getValue() + " " + myArrInfo[j].getValue());
				if(copy[i].getValue() == myArrInfo[j].getValue()) {
					sb.append(j + " ");
					break;
				}
			}
		}
		
		bw.write(sb + "\n");
		bw.flush();
		bw.close();
		br.close();
//		sc.close();
	}

}