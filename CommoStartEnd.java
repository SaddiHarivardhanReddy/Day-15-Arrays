package com.codegnan.arrays;

import java.util.Scanner;

public class CommoStartEnd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[] a=new int[n];
		int[] b=new int[m];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<m;i++) {
			b[i]=sc.nextInt();
		}
				if(a[0]==b[0]||a[n-1]==b[m-1]) {
					System.out.println("true");
				}
				else {
					System.out.println("false");
				}

		sc.close();
	}

}
