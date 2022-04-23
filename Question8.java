package com.asgnmnt;

import java.util.Scanner;

public class Question8 {
public static void main(String[] args) {
	System.out.println("Enter a number to print it's times table");
	Scanner sc = new Scanner(System.in);
	int n= sc.nextInt();
	System.out.println("Enter the number up to where you want to print the table");
	int j= sc.nextInt();
	for(int i=1; i<=j; i++) {
		System.out.println(n +" X " +i +" = "+ n*i);
		
	}
}
}
