package com.codegnan.arrays;

import java.util.Scanner;

public class SecondHighestScore {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] scores=new int[n];
		for(int i=0;i<n;i++) {
			scores[i]=sc.nextInt();
		}
		for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (scores[i] > scores[j]) {
                    int temp = scores[i];
                    scores[i] = scores[j];
                    scores[j] = temp;
                }
            }
        }

        // Find second highest (consider duplicates)
        int highest = scores[n - 1];
        int secondHighest = -1;

        for (int i = n - 2; i >= 0; i--) {
            if (scores[i] != highest) {
                secondHighest = scores[i];
                break;
            }
        }

            System.out.println("Second highest score: " + secondHighest);
            sc.close();
	}

}
