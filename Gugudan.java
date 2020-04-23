package main;

import java.util.Scanner;

public class Gugudan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("출력할 단을 입력하세요 : ");
		int dan = scan.nextInt();
		
		for(int i =1;i<10;i++) {
			System.out.println(dan +" * "+i+" = "+(i*dan));
		}
	}

}
