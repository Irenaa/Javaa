package com.gmail.bezkrovna1998;

import java.util.Scanner;
import java.util.Arrays;
public class Level2Hometask2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		int n = sc.nextInt();
		int[] mas=new int[n];
		for (int i = 0; i < mas.length; i++) {
			mas[i]=(int)(Math.random()*100+1);
		}
		System.out.println(Arrays.toString(mas));
		int temp=0;
		for (int i = 0; i < mas.length/2; i++) {
			temp=mas[i];
			mas[i]=mas[n-1-i];
			mas[n-1-i]=temp;
		}
		System.out.println(Arrays.toString(mas));

		sc.close();
	}

}
