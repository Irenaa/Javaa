package com.gmail.bezkrovna1998;

import java.util.Scanner;

public class Leve1Hometask2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n:");
		int n = sc.nextInt();
		int facterial = 1;
		if ((n > 4) && (n < 16)) {
			for (int i = 0; i < n; i++) {
				facterial =facterial*(i+1);
			}
			System.out.println("Facterial: "+facterial);
		} else {
			System.out.println("I can't count that(");

		}
		sc.close();
	}

}
