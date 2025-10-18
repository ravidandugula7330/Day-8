package com.codegnan.controlstatements;

import java.util.Scanner;

public class AtmWithdrawProcess {

	public static void main(String[] args) {
		double balance = 10000;
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter the WithdrawAmount");
			
			double WithdrawAmount  = scanner.nextDouble();
			
			if (WithdrawAmount <= balance ) {
				balance -= WithdrawAmount;
				System.out.println("WIthdraw succesful . Remaing balance is" +balance);
			}else {
				System.out.println("Insufficint funds");
				
			}
			
		
		
		
		
		
		
		
	}

}
