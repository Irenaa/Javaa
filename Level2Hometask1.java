package com.gmail.bezkrovna1998;

import java.util.Scanner;

public class Level2Hometask1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n:");
		int n = sc.nextInt();
		int i = 0;
		int j = 0;
		for (; i < 2 * n - 1;) {
			if (j >= (n  - Math.abs(n - i))) {
				System.out.println();
				i++;
				j = 0;
			}
			System.out.print("*");
			j++;
		}
		sc.close();
	}

}
