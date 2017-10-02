package com.gmail.bezkrovna1998;

import java.util.Scanner;

public class Level1Hometask4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n:");
		int n=sc.nextInt();
		System.out.println("Enter m:");
		int m=sc.nextInt();
		for (int i=0;i<m;i++) {
			
			for(int j=0;j<n;j++) {
				if((i==0)||(j==0)||(i==(m-1))||(j==(n-1))) {
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
