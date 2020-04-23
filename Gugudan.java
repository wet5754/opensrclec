package main;

import java.util.Scanner;

public class Gugudan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("출력할 단을 입력하세요 : ");
		int dan = scan.nextInt();
		if(dan<0)
			System.out.println("구구단 출력 불가!!");	
		else if(dan ==0) {
			for (int i = 2; i < 10; i++) {
				for (int j = 2; j < 10; j++)
					System.out.print(i + " * " + j + " = " + (i * j)+" ");
				System.out.println();
			}
		}
		else
			for (int i = 1; i < 10; i++)
				System.out.println(dan + " * " + i + " = " + (i * dan));
	}

}
