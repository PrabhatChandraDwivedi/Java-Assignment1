package com.asgnmnt;

import java.util.Scanner;

public class Question13 {
public static void main(String[] args) {
	System.out.println("Enter the array size");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int[] arr = new int[n];
	System.out.println("Enter the values of array");
	for (int i = 0; i < n; i++) {
		
		arr[i]=sc.nextInt();
	}
	int flag=0;
	for (int i = 0; i < n ; i++) {
		
		flag=0;
		for (int j=0; j<n; j++) {
			
			
			if(arr[n-i-1]>=arr[j]) {
				//System.out.println(arr[n-i-1]);

				flag++;
				//System.out.println("The value of flag in if is :" + flag);
				if (flag==n) {
					System.out.println("The biggest value in the given array is: " +arr[n-i-1]);
				}
				
				
					
				
			}
			else {
				//System.out.println("The value of flag in else is : " + flag);
				flag=0;
				//System.out.println("The value of flag in after else is : " + flag);

			}
		}
		
		
		
		
		
	}
	
for (int i = 0; i < n ; i++) {
		
		flag=0;
		for (int j=0; j<n; j++) {
			
			
			if(arr[n-i-1]<=arr[j]) {
				//System.out.println(arr[n-i-1]);

				flag++;
				//System.out.println("The value of flag in if is :" + flag);
				if (flag==n) {
					System.out.println("The smallest value in the given array is: " +arr[n-i-1]);
				}
				
				
					
				
			}
			else {
				//System.out.println("The value of flag in else is : " + flag);
				flag=0;
				//System.out.println("The value of flag in after else is : " + flag);

			}
		}
		
		
		
		
		
	}
}
}
