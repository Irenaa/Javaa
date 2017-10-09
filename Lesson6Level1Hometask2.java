package com.gmail.bezkrovna1998;

public class Lesson6Level1Hometask2 {

	public static void main(String[] args) {
		int a=5;
		double b=7.98;
		String s="The sum is ";
		System.out.println(glue(a,b,s));

	}

	public static String glue(int a,double b,String s) {
		double sum=a+b;
		s=s+sum;
		return s;
	}
}
