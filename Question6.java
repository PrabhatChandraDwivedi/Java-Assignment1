package com.asgnmnt;

import java.util.Scanner;

public class Question6 {
public static void main(String[] args) {
	System.out.println("Enter the number of rows of the pattern you want to be printed");
	Scanner sc = new Scanner(System.in);
	int n= sc.nextInt();
	for(int i=0; i<n ; i++) {
		for(int j=0; j<=i;j++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
}
