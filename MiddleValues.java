package com.codegnan.arrays;

import java.util.Scanner;

public class MiddleValues {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] a=new int[3];
		for(int i=0;i<3;i++) {
			a[i]=sc.nextInt();
		}
		int[] b=new int[3];
		for(int i=0;i<3;i++) {
			b[i]=sc.nextInt();
		}
		for(int i=0;i<3;) {
			System.out.println(a[i+1]+" "+b[i+1]);
			break;
		}
		sc.close();
		
	}

}
