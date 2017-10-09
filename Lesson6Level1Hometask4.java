package com.gmail.bezkrovna1998;

import java.util.Scanner;

public class Lesson6Level1Hometask4 {

	public static void main(String[] args) {
		int[] mas = new int[30];
		for (int i = 0; i < mas.length; i++) {
			mas[i] = (int) (Math.random() * 200 - 100);
			System.out.print(mas[i] + " ");
		}
		System.out.println();
		System.out.println("Your element index is "+findElement(element(),mas));
	}
	

	public static int element() {
		System.out.println("Enter the element you need to find the index:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		return n;
	}
	
	public static int findElement(int a,int...array) {
		int index=-1;
		for (int i = 0; i < array.length; i++) {
			if(a==array[i]) {
				index=i;
			}
		}
		return index;
	}

}
