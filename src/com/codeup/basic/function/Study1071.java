package com.codeup.basic.function;

import java.util.Scanner;

public class Study1071 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] strArr = sc.nextLine().split(" ");
		int i = 0;
		
		check(strArr, i);
		
		sc.close();
	}
	
	public static void check(String[] strArr, int i) {
	    if(!strArr[i].equals("0")) {
	        System.out.println(strArr[i++]);
	        check(strArr, i);
	    }
	}

}
