package com;
import java.util.Scanner;
public class Calculator
{
	//Addition function
	public void Addition(int a, int b)
	{
		System.out.println("Addition of a and b is : " + (a+b));
	}
	
	//Subtraction function
	public void Subtraction(int a, int b)
	{
		System.out.println("Subtraction of a and b is : " + (a-b));
	}
	
	//Multiplication function
	public void Multiplication(int a, int b)
	{
		System.out.println("Multiplication of a and b is : " + (a*b));
	}
	
	//Division function
	public void Division(int a, int b)
	{
		System.out.println("Division of a and b is : " + (a/b));
	}
	
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		int i=0;
		Calculator c = new Calculator();
		System.out.println("Welcome 'CODETECH IT SOLUTIONS' to my calculator program!");
		System.out.println("Please enter your opration choise number");
	    
		while(i<1)
		{
			System.out.println("1. Addition \n2. Subtraction \n3. Multiplication "
					+ "\n4. Division \n5. Exit Opration");
		    int choise = sc.nextInt();
		    switch(choise)
		    {
		       case 1:
		    	   System.out.println("Enter value for a and b");
		    	   a = sc.nextInt();
		    	   b = sc.nextInt();
		    	   c.Addition(a, b);
		    	   break;
		    	   
		       case 2:
		    	   System.out.println("Enter value for a and b");
		    	   a = sc.nextInt();
		    	   b = sc.nextInt();
		    	   c.Subtraction(a, b);
		    	   break;
		    	
		       case 3:
		    	   System.out.println("Enter value for a and b");
		    	   a = sc.nextInt();
		    	   b = sc.nextInt();
		    	   c.Multiplication(a, b);
		    	   break;
		    	   
		       case 4:
		    	   System.out.println("Enter value for a and b");
		    	   a = sc.nextInt();
		    	   b = sc.nextInt();
		    	   c.Division(a, b);
		    	   break;
		    	   
		       default:
		    	   i++;
		    	   break;
		    }
		}
		System.out.println("You exit from calculator");
	}
}
