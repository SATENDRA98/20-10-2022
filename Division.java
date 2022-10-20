package com.exceptions.demo;

import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter numerator : ");
		int x=sc.nextInt();
		System.out.println("Enter denominator");
		int y=sc.nextInt();

		System.out.println("Division : "+divide(x,y));
	
		sc.close();
	}

	public static int divide(int x, int y) {
		int d=0;
		try {
			d = x/y;
			
		}catch(ArithmeticException e) {
			System.out.println("Can not divide by zero");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return d;

	}

}