package com.codegnan.controlstatements;

import java.util.Scanner;

public class BasicIfDemo {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number");
		int number = scanner.nextInt();
		//if syntax
		if (number > 0) {
			System.out.println("The Number " + "is positive");
		} else {
		System.out.println("The Number " + "is negative");
		}
		System.out.println("This statement always execute");
		
		scanner.close();
		
		
		}
		
		
	}


