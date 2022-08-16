package com.brigelabz.logical_program_Day_6;

import java.util.Scanner;

public class Pefet_number {

	public static void main(String[] args) {

		int sum = 0;
		System.out.println("Enter any number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				System.out.println(i);
				sum = sum + i;
			}

		}

		if (n == sum)
			System.out.println("Entered number is a Perfect Number .");
		else
			System.out.println("Entered number is not a Perfect Number.");

	}

}
