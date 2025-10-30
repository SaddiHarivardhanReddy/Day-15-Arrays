package com.codegnan.arrays;

import java.util.Scanner;

public class MissingRollNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int missing=-1;
		for(int i=0;i<n-1;i++) {
			if(arr[i+1]!=arr[i]+1) {
				missing=arr[i]+1;
				break;
			}
		}
		System.out.println("Missing Number: "+missing);
		sc.close();
		

	}

}
