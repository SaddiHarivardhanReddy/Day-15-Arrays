package com.codegnan.arrays;

import java.util.Scanner;

public class RotateStudent {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		 int first = arr[0];  
	        for(int i = 0; i < n - 1; i++) {
	            arr[i] = arr[i + 1];  
	        }
	        arr[n - 1] = first;  
	        
	        
	        System.out.print("[");
	        for(int i = 0; i < n; i++) {
	            System.out.print(arr[i]);
	            if(i < n - 1) System.out.print(", ");
	        }
	        System.out.println("]");
	        
	        sc.close();

	}

}
