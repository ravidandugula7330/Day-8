package com.codegnan.controlstatements;

import java.util.Scanner;

public class ElectricityBillCalculator {

	public static void main(String[] args) {
		/*1. Electricity Bill Calculator (With Slabs & Surcharge)
		 Problem Statement:
		Write a Java program to calculate the monthly electricity bill based on the number of units consumed, applying the following slab rates:
		Units Consumed
		Rate per Unit
		0 - 100
		₹1.50
		101 - 200
		₹2.00
		201 - 300
		₹3.00
		Above 300
		₹5.00

		If the total bill exceeds ₹1000, apply a 10% surcharge.
		If the user is a senior citizen, apply an additional 5% discount on the total.*/	
		
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter units consumed");
	int units = scanner.nextInt();
	
	System.out.println("is the user is senior citizen ? (true/false)");
	boolean isSeniorCitizen = scanner.nextBoolean();
	double billAmount;
	
	if(units<=100) {
		billAmount = units*1.50;
	}else if (units<=200) {
		billAmount = (100*1.50) + ((units - 100) * 2.00);
	}else if (units<=300) {
		billAmount = (100*1.50) + (100*2.00) + ((units - 200) * 3.00);
	}else {
		billAmount = (100*1.50) + (100*2.00) + (100*3.00) +((units-300) * 5.00);
		
	}
	if (billAmount >10000) {
		billAmount += billAmount * 0.10;
	}
		
		if (isSeniorCitizen) {
			billAmount -= billAmount *0.50;	
		}
		
		System.out.println("The total Electricity bill is : " +billAmount);
	}

}
