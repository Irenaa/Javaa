package com.gmail.bezkrovna1998;

public class Level2Hometask2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean er=true;
		for(int i=2;i<=100;i++) {
			for(int j=2;j<=100;j++) {
				if((i%j==0)&&(i!=j)){
					er=false;
				}
			}
			if(er) {
				System.out.print(i+" ");
			}
			er=true;
		}
		
	}

}
