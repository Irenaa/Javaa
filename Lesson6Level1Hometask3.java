package com.gmail.bezkrovna1998;
import java.util.Scanner;
public class Lesson6Level1Hometask3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length:");
		int length=sc.nextInt();
		System.out.println("Enter the width:");
		int width=sc.nextInt();
		drawRectangular(length,width);
		sc.close();
	}

	public static void drawRectangular(int a,int b) {
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
