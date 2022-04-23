package com.asgnmnt;

import java.util.Scanner;

public class Question15 {
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
	    				flag++;
						if (flag==n) {
							int val1=arr[n-i-1];
							secondBig(val1, arr);
							}
	    		}
	    				else {
	    					flag=0;
	    					}
	    	}	
	}
	
	

}
public static void secondBig(int a, int[] ar) {
	int flag=0;
	int n= ar.length;
	for (int i = 0; i < n ; i++) {
    	flag=0;
    	for (int j=0; j<n; j++) {
    		if(ar[n-i-1]>=ar[j]) {
    			flag++;
				if (flag==n-1 && ar[n-i-1]<a) {
				System.out.println("The second biggest number is: " + ar[n-i-1]);
				}
    		}
    		else {
			flag=0;
    			}
	}
	
	
	
	
	
}
	
}
}
