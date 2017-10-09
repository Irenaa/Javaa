package com.gmail.bezkrovna1998;

import java.util.Scanner;

public class Lesson6Level1Hometask1 {

	public static void main(String[] args) {
		int[] mas = new int[numberElement()];
		for (int i = 0; i < mas.length; i++) {
			mas[i] = (int) (Math.random() * 200 - 100);
			System.out.print(mas[i] + " ");
		}

		System.out.println("Max: " + findMax(mas));
	}

	public static int numberElement() {
		System.out.println("Enter the number of elements:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		return n;
	}
	
	public static int findMax(int... array) {
		int max = array[0];
		for (int i : array) {
			if (max < i) {
				max = i;
			}
		}
		return max;
	}
}