package com.codegnan.controlstatements;

import java.util.Scanner;

public class TicketPricing {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("enter passenger type ");
		String passengertype = scanner.next();
		
		System.out.println("enter booking time");
		String bookingtime = scanner.next();
		
		boolean isMember = true;
		double baseprice  = 5000;
		
		if (passengertype.equalsIgnoreCase("child")) {
			baseprice *= 0.5;
		}else {
			if (passengertype.equalsIgnoreCase("senior")) {
				baseprice *= 0.8;
			}else {
				
				if (passengertype.equalsIgnoreCase("adult")) {
					
				//no discount
					}else {
						System.out.println(" invalid");
						return;
					}
			}
		}
	
	  
	
		if(bookingtime.equalsIgnoreCase("early")) {
			baseprice *= 0.9;
		}else {
			if (bookingtime.equalsIgnoreCase("normal")) {
				//no dicount
			}else {
				if (bookingtime.equalsIgnoreCase("last minute")) {
					baseprice *= 1.2;
				}else {
					
					System.out.println(" invalid booking time ");
				     return;
				}
			}
		}
		   
		
		if(isMember) {
			
			baseprice *= 0.95;
			
		}
		System.out.println("final price"+ baseprice);
		}
	
	
	
	
	
	
	}