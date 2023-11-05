package com.gradedproject.q2;

import java.util.Scanner;

public class PowerQ2 {

	static int power(int a,int b) {
		if(b!=0) {
			return a*power(a,b-1);
		}
		else
			return 1;
	}

	public static void main(String[] args) {
		Scanner input =new Scanner((System.in));
		System.out.println("Enter the base number X:");
		int a=input.nextInt();
		System.out.println("Enter the power N");
		int b =input.nextInt();

		System.out.println("X power N is: "+PowerQ2.power(a,b));
		input.close();
	}


}
