package com.asgnmnt;

import java.util.Scanner;

public class Question5 {
public static void main(String[] args) {
	float SI,p,r,t;
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the principal");
	p=sc.nextFloat();
	
	System.out.println("Enter the rate");
	r=sc.nextFloat();
	
	System.out.println("Enter the time duration");
	t=sc.nextFloat();
	SI=p*r*t/100;
	System.out.println("The Simple interest is: " + SI);
	
	
}
}
