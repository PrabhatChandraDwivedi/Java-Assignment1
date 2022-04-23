package com.asgnmnt;

import java.util.Scanner;

public class Question14 {
public static void main(String[] args) {
	System.out.println("Enter the size of array");
	Scanner sc = new Scanner(System.in);
	int n= sc.nextInt();
	int[] arr = new int[n];
	int[] arra = new int[n];
	System.out.println("Enter the values of array");
	for (int i = 0; i < n; i++) {
		arr[i]=sc.nextInt();
	}
	for (int i = 0; i < n; i++) {
		arra[n-i-1]=arr[i];
	}
	System.out.print("The reversed array is:");
	for (int i : arra) {
		System.out.print(" " +i);
	}
}
}
