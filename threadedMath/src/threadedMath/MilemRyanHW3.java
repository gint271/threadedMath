/*
 * Author: Ryan Milem
 * 
 * Homework Assignment 3
 * 
 * 5/20/14
 * 
 * Handles starting the threads to perform the various operations on the inputted numbers.  Also
 * takes in user input.
 */

package threadedMath;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MilemRyanHW3 
{

	public static void main(String[] args) 
	{
		BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
		String[] input;
		String split;
		int number1;
		int number2;
		
		while(true)
		{
			System.out.println("Enter the two integers seperated by a space.");
			try
			{
				input = keyboard.readLine().split(" ");
			}
			catch (Exception e)
			{
				System.out.println("Failed to read from console.");
				return;
			}
			
			number1 = Integer.parseInt(input[0]);
			number2 = Integer.parseInt(input[1]);
			
			System.out.println("Number 1 is " + number1);
			System.out.println("Number 2 is " + number2);
		}
	}

}
