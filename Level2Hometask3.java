package com.gmail.bezkrovna1998;

import java.util.Scanner;

public class Level2Hometask3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n(odd number):");
		int n = sc.nextInt();
		for(int i=0;i<n/2+1;i++) {
			for(int j=0;j<n;j++) {
				if((i<=j)&&(j<=-i+n-1)) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		for(int i=n/2+1;i<n;i++) {
			for(int j=0;j<n;j++) {
				if((i>=j)&&(j>=-i+n-1)) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		sc.close();
	}

}
