package com.asgnmnt;

import java.util.Scanner;

public class Question10 {
public static void main(String[] args) {
	System.out.println("Enter two numbers");
	Scanner sc = new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	System.out.println("Enter 1 for addition");
	System.out.println("Enter 2 for subtraction");
	System.out.println("Enter 3 for multiplication");
	System.out.println("Enter 4 for division");
	
	int n= sc.nextInt();
	switch (n) {
	case 1:
		    System.out.println("The addition of numbers is: " + (a+b));
		break;
	case 2:
	    System.out.println("The subtraction of numbers is: " + (a-b));
	    break;
	case 3:
	    System.out.println("The multiplication of numbers is: " + (a*b));
	    break;
	case 4:
	    System.out.println("The division of numbers is: " + (a/b));
	    break;



	default:
		System.out.println("Invalid option");
		break;
	}
}
}
