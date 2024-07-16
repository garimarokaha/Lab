package practice1;

import java.util.Scanner;

// Make a calculator . take two number (a and b ) from the user and an operation as follows:
//  additon , substraction, multiplication, division, modulo

public class Calculator {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the value of a ");
		   int a= sc.nextInt();
		System.out.println("enter the value of b"); 
		   int b=sc.nextInt();
// for addition
		int sum= a+b;
		System.out.println("the sum is:");
		System.out.println(sum);
// for substraction
		int difference= a-b;
		System.out.println("The substraction is :");
		System.out.println(difference);
		
// for multiplication
		int multiplication= a*b;
		System.out.println("The multiplication is :");
		System.out.println(multiplication);
		
// for division
		int division= a/b;
		System.out.println("The division is:");
		System.out.println(division);
		
// for remainder
		int remainder= a%b;
		System.out.println("The remainder is :");
		System.out.println(remainder);
		

	}

}
