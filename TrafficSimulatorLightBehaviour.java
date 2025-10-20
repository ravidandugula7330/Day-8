package com.codegnan.controlstatements;

import java.util.Scanner;

public class TrafficSimulatorLightBehaviour {

	public static void main(String[] args) {
		/*Question 6)
	Write a Java program to simulate traffic light behavior using nested if–else statements.

	 The program should take:
	A light state (Green, Yellow, or Red)
	The hour (0–23 in 24-hour format)
	 and display the vehicle’s action based on these rules:

	If the light is Green, the action is “Go”.
	If the light is Red, the action is “Stop”.

	If the light is Yellow:
	During daytime (6 AM to 6 PM) → “Slow”
	During nighttime → “Stop”*/
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Light State (yellow/red/green)");
		String lightstate = scanner.next();
		System.out.println("Enter Hour(0-23)");
		
		int hour = scanner.nextInt();
		boolean isDaytime = (hour >=6 && hour<=18);
		String action;
		
		
		if (lightstate.equalsIgnoreCase("green")) {
		action = "go";
		
	} else {
		if (lightstate.equalsIgnoreCase("red")) {
		action = "stop";
		
	}else {
		if (lightstate.equalsIgnoreCase("yellow")) {
		if(isDaytime) {
			action = "slow";
		}else {
			action = "stop";
			
		}
	}else {
		action="Invalid Light State";
     	}
       }
	}
		System.out.println(action);
	}
}
	
		