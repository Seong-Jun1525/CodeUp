package com.codeup.basic.object;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

class Student {
	private String name;
	private int score;
	
	public Student() {}

	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
}

//학생 점수로 내림차순 정렬하기
class ScoreSort implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getScore() < o2.getScore() ? 1 : o1.getScore() > o2.getScore() ? -1 : 0;
	}
	
}

public class Study3015 {

	public static void main(String[] args) throws IOException {
		// 성적표 출력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		List<Student> sList = new ArrayList<>();

		StringTokenizer stk = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(stk.nextToken());
		int m = Integer.parseInt(stk.nextToken());
		
		for(int i = 0; i < n; i++) {
			stk = new StringTokenizer(br.readLine());
			sList.add(new Student(stk.nextToken(), Integer.parseInt(stk.nextToken())));
		}
		
		Collections.sort(sList, new ScoreSort());
		
		for(int i = 0; i < m; i++) {
			sb.append(sList.get(i).getName() + "\n");
		}

		bw.write(sb + "\n");
		bw.flush();
		bw.close();
		br.close();
	}

}
