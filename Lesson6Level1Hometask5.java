package com.gmail.bezkrovna1998;
import java.util.Scanner;
public class Lesson6Level1Hometask5 {

	public static void main(String[] args) {
		System.out.println("Enter the line:");
		Scanner sc = new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println(numberOfWords(s));
		sc.close();
	}

	public static int numberOfWords(String s) {
		String [] t=s.split(" ");
		return t.length;
	}
}
