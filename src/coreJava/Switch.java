package coreJava;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println(System.getProperty("java.version"));
		System.out.println("enter value of first number");
		
		int a = sc.nextInt();
		System.out.println("enter value of second number");
		int b = sc.nextInt();
		int op =0;
		while(op<4) {
		    
			System.out.println("press 1 : To addition");
			
			System.out.println("press 2 : To subtraction");
			
			System.out.println("press 3 : To multiply");
			
			System.out.println("press default number  : To exit");
			
			op=sc.nextInt();
			
		switch(op) {
		
		case 1 :{System.out.println("Addition of a&b :" +(a+b));
		}
		
		
		case 2 : {System.out.println("Subtraction of a&b :"+(a-b));}
		
		case 3 : {System.out.println("Multiplication of a&b :"+(a*b));
		}
		
		default : {System.exit(op);}
		}
		
	  }
	}
}
