package com.asgnmnt;

import java.util.Scanner;

public class Question3 {
public static void main(String[] args) {
	int n,a,b=0;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number");
	n=sc.nextInt();
	while (n>0) {
		a=n%10;
		b=b*10 + a;
		n=n/10;
	}
	System.out.println("The reversed number is:  " +b);
}
}
