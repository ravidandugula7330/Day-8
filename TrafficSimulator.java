package com.codegnan.controlstatements;

import java.util.Scanner;

public class TrafficSimulator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Light  state(green/yellow/red");
		String lightstate = scanner.next();

		System.out.println("Enter Hour(0-23)");
		int hour = scanner.nextInt();
		boolean isDayTime = (hour >= 6 && hour <= 18);
		String action;
		if (lightstate.equalsIgnoreCase("green")) {
			action = "go";
		} else {
			if (lightstate.equalsIgnoreCase("red")) {
				action = "stop";

			} else {
				if (lightstate.equalsIgnoreCase("yellow")) {
					if (isDayTime) {
						action = "slow";
					} else {
						action = "stop";
					}

				} else {
					action = "Invalid Light State";
				}

			}

		}
		System.out.println(action);

	}
}
