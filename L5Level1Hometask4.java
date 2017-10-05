package com.gmail.bezkrovna1998;
import java.util.Scanner;
public class Level1Hometask4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your text:");
		String mas=sc.nextLine();
		char[] text = mas.toCharArray();
		int num=0;
		for (int i = 0; i < text.length; i++) {
			if(text[i]=='b') {
				num+=1;
			}
		}
		System.out.println("The number of 'b' in text is: "+num);

		sc.close();
	}

}
