package com.codeup.basic.object;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

class Memory {
	private String str;
	private int count;
	
	public Memory() {}

	public Memory(String str, int count) {
		this.str = str;
		this.count = count;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
}

public class Study3170 {

	public static void main(String[] args) throws IOException {
		// 기억력 테스트9
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		List<Memory> mList = new ArrayList<>();
		
		StringTokenizer stk = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(stk.nextToken());
		int m = Integer.parseInt(stk.nextToken());
		
		for(int i = 0; i < n; i++) {
			stk = new StringTokenizer(br.readLine());
			mList.add(new Memory(stk.nextToken(), Integer.parseInt(stk.nextToken())));
		}
		
		int count = 0;

		for(int i = 0; i < m; i++) {
			String str = br.readLine();
			
			for(int j = 0; j < mList.size(); j++) {
				if(str.equals(mList.get(j).getStr())) {
					count += mList.get(j).getCount();
				}
			}
			sb.append(count + "\n");
			count = 0;
		}

		bw.write(sb + "\n");
		bw.flush();
		bw.close();
		br.close();
	}

}
