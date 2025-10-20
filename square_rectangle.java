package com.codegnan.controlstatements;

import java.util.Scanner;

public class square_rectangle {

	public static void main(String[] args) {

/*The Question 9)
A geometry app classifies a quadrilateral based on four side lengths ($a, b, c, d$) and whether opposite sides are equal.
Output "Rectangle" if opposite sides are equal ($a=c$ and $b=d$).
Output "Square" if all sides are equal.
Output "Other" otherwise.
Input Format: Four integers a,b,c,d, separated by spaces.
Output Format: A string: "Square", "Rectangle", or "Other".*/
		
		
		System.out.println("Enter four side lengths (a b c d):");
				 Scanner scanner=new Scanner(System.in);
				 
			        
			        int a = scanner.nextInt();
			        int b = scanner.nextInt();
			        int c = scanner.nextInt();
			        int d = scanner.nextInt();

			     
			        if (a == b && b == c && c == d) {
			            System.out.println("Square");
			        } else if (a == c && b == d) {
			            System.out.println("Rectangle");
			        } else {
			            System.out.println("Other");
			        }

			        scanner.close();
			}

	}


