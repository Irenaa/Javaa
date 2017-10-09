package com.gmail.bezkrovna1998;

public class Lesson6Level2Hometask2 {

	public static void main(String[] args) {
		int n=999-100+1;
		int[]a=makeArray1(n);
		int[]c=makeArray2(quantity(n),n,a);
		polindrom(c);
		System.out.println("max "+findMax(c));

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
	
	public static void polindrom(int...c) {
		for (int i = 0; i < c.length; i++) {
			if((c[i]/10000>=1)&&(c[i]/10000<10)) {
				int a=c[i]/10000;
				int b=c[i]%10000/1000;
				int d=c[i]%100/10;
				int f=c[i]%10;
				if((a!=f)||(b!=d)) {
					c[i]=-1;
				}
			} else {
				int a=c[i]/100000;
				int b=c[i]%100000/10000;
				int e=c[i]%10000/1000;
				int t=c[i]%1000/100;
				int d=c[i]%100/10;
				int f=c[i]%10;
				if((a!=f)||(b!=d)||(e!=t)) {
					c[i]=-1;
				}
			}
		}
	}
	
	public static int quantity(int a) {
		int fact=0;
		for (int i = 0; i < a; i++) {
			fact=fact+(i+1);
		}
		return fact;
	}
	
	public static int[] makeArray2 (int n,int m,int... a) {
		int[] foo = new int[n];
		int k=0;
	    for (int i = 0; i <m ; i++) {
	        for (int j = 0; j <m-i ; j++) {
				foo[k]=a[i]*a[j+i];
				k++;
			}
	    }
	return foo;
	}
	
	public static int[] makeArray1 (int n) {
		int[] foo = new int[n];
	    for (int i = 0; i <n ; i++) {
	        foo[i] = 100+i;
	    }
	return foo;
	}
}
