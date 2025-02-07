package com.codeup.basic.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Friend {
	private String name;
	private int score;
	
	public Friend() {}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setScore(int score) {
		this.score = score;
	}
	
	public int getScore() {
		return this.score;
	}
}

public class Study1420 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		/** 3등을 찾기위해 fArr 리스트 정렬하기
		 * o1 > o2 이면 1
		 * o1 < o2 이면 -1
		 * o1 = o2 이면 0 
		 */
		class ScoreSort implements Comparator<Friend> {

			@Override
			public int compare(Friend o1, Friend o2) {
				return o1.getScore() < o2.getScore() ? 1 : o1.getScore() > o2.getScore() ? -1 : 0;
			}
			
		}
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		List<Friend> fArr = new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			Friend f = new Friend();
			String[] friendInfo = br.readLine().split(" ");
			f.setName(friendInfo[0]);
			f.setScore(Integer.parseInt(friendInfo[1]));

			fArr.add(f);
		}
		
		Collections.sort(fArr, new ScoreSort());
		
		System.out.println(fArr.get(2).getName());
	}

}
