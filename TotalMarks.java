package com.codegnan.arrays;

import java.util.Scanner;

public class TotalMarks {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] marks=new int[n];
		for(int i=0;i<n;i++) {
			marks[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<n;i++) {
			sum+=marks[i];
		}
		System.out.println(sum);
		sc.close();

	}

}
