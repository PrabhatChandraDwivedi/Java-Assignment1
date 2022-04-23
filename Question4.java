package com.asgnmnt;

import java.util.Scanner;

public class Question4 {
public static void main(String[] args) {
	int n;
	System.out.println("Enter a number");
	Scanner sc = new Scanner(System.in);
	n=sc.nextInt();
	if (n%2==0) {
		System.out.println("Even");
	} else {
			System.out.println("Odd");
	}
}
}
