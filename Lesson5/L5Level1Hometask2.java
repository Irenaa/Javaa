package com.gmail.bezkrovna1998;

import java.util.Arrays;
import java.util.Scanner;

public class Level1Hometask2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		int n = sc.nextInt();
		if(n>0) {
		int[] mas = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter the "+(i+1)+" element: ");
			mas[i]=sc.nextInt();
		}
		System.out.println("The array is:");
		System.out.println(Arrays.toString(mas));
		}else {
			System.out.println("error");
		}
		sc.close();
	}

}
