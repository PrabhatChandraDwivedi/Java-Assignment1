package com.asgnmnt;

import java.util.Scanner;

public class Question2 {
public static void main(String[] args) {
	int n,a,b=0;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number");
	n=sc.nextInt();
	while (n>0) {
		a=n%10;
		b=b+a;
		n=n/10;
		
	}
	System.out.println("The sum of the digits you entered is: " + b);
}
}
