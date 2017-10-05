package com.gmail.bezkrovna1998;

public class Level1Hometask1 {

	public static void main(String[] args) {
		int [] mas= {0,5,2,4,7,1,3,19};
		int quantity=0;
		for(int i:mas){
			if(i%2!=0) {
				quantity+=1;
			}
		}
		System.out.println("The quantity of odd numbers are "+quantity);

	}

}
