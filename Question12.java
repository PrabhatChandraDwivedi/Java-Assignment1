package com.asgnmnt;

import java.util.Scanner;

public class Question12 {
public static void main(String[] args) {
	int a=0;
	System.out.println("Enter the size of array");
	Scanner sc = new Scanner(System.in);
	int n= sc.nextInt();
	int[] arr = new int[n];
	System.out.println("Enter the values of array");
	for(int i =0; i<n; i++) {
		arr[i]=sc.nextInt();
	}
	for (int j = 0; j < arr.length; j++) {
		a=a+arr[j];
	}
	
	System.out.println("The sum of the elements of array is: "+a);

}
}
