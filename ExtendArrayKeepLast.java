package com.codegnan.arrays;

import java.util.Scanner;

public class ExtendArrayKeepLast {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int[] arr = new int[n];
	        for(int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }

	        
	        int[] backup = new int[2 * n];
	        backup[backup.length - 1] = arr[n - 1];
	        System.out.print("Output: [");
	        for(int i = 0; i < backup.length; i++) {
	            System.out.print(backup[i]);
	            if(i < backup.length - 1) System.out.print(", ");
	        }
	        System.out.println("]");

	        sc.close();

	}

}
