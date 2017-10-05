package com.gmail.bezkrovna1998;
import java.util.Arrays;
public class Level1Hometask3 {

	public static void main(String[] args) {
		int[] mas=new int[15];
		for (int i = 0; i < mas.length; i++) {
			mas[i]=(int)(Math.random()*100+1);
		}
		int[] masik=Arrays.copyOf(mas, 30);
		for (int i = 0; i < masik.length/2; i++) {
			masik[masik.length/2+i]=2*masik[i];
		}
		System.out.println(Arrays.toString(mas));
		System.out.println(Arrays.toString(masik));
		
	}

}
