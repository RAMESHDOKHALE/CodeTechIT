package com;
import java.util.Random;
import java.util.Scanner;

public class NumberGuess 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int lowerBound = 1;
        int upperBound = 100;
        
        // Generating random number between 1 to 100
        int randomNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
        
        System.out.println("Guess the number between 1 and 100 within 5 attempts");
        
        int userGuess;
        int attempts = 0;

        do 
        {
            System.out.print("Enter your guess: ");
            
            //user guessing value
            userGuess = scanner.nextInt();
            attempts++;

            if (userGuess < randomNumber) 
            {
                System.out.println("Too low! Try again.");
            } 
            
            else if (userGuess > randomNumber) 
            {
                System.out.println("Too high! Try again.");
            } 
            else 
            {
                System.out.println("Congratulations! You guessed the correct number" + randomNumber);
            }

        } while (attempts<5);
    }
}

