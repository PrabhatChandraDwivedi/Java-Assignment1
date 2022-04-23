package com.asgnmnt;

import java.util.Scanner;

public class Question7 {
public static void main(String[] args) {
	int k=0;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number of rows you want to be printed");
	int n=sc.nextInt();
	for(int i=0; i<n; i++) {
		for(int j=n-i; j>1; j--) {
			System.out.print(" ");
		}
		for(int m=0; m<=i; m++) {
			k++;
			System.out.print(k+" ");
		}
		System.out.println();
	}
}
}
