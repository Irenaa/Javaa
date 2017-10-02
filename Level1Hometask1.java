package com.gmail.bezkrovna1998;

import java.util.Scanner;

public class Level1Hometask1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n:");
		int n=sc.nextInt();
		for (int i=0;i<5;i++) {
			
			for(int j=0;j<n;j++) {
				if(j%2==0) {
					System.out.print("***");
				}else {
					System.out.print("+++");
				}
			}
			System.out.println();
		}
		sc.close();
	
	}

}
