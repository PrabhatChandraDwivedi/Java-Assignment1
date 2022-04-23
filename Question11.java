package com.asgnmnt;

import java.util.Scanner;

public class Question11 {
public static void main(String[] args) {
	System.out.println("Enter the units of electricity consumed");
	Scanner sc = new Scanner(System.in);
	float n= sc.nextFloat();
	if(n<=100) {
		System.out.println("Your electricity bill is: " + (n*1.20) + " Rupees");
	}
	else if (n>100 && n<=300) {
		
	float d=n-100;
		
		System.out.println("Your electricity bill is: " + (100*1.20 + d*2)+ " Rupees");

	}
	else if (n>300 && n<=600) {
		float e= n-300;
		System.out.println("Your electricity bill is: " + (100*1.20 + 200*2+ e*3)+" Rupees");

	}
	else {
		float f= n-600;
		System.out.println("Your electricity bill is: " + (100*1.20 + 200*2+ 300*3+f*5)+" Rupees");

	}
}
}
