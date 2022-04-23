package com.asgnmnt;

import java.util.Scanner;

public class Question9 {
	public static void main(String[] args) {
		System.out.println("Enter three numbers");
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int j= sc.nextInt();
		int m= sc.nextInt();
		if (n>j && n>m) {
			System.out.println(n + " is biggest");
		}
		else if (j>n && j>m) {
			System.out.println(j + " is biggest");
			
		}
		else {
			System.out.println(m + " is biggest");
		}
	}
}
