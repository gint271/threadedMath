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
		Thread subtractThread;
		Thread adderThread;
		Thread multiplierThread;
		Thread dividerThread;
		
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
			
			subtractThread = new Thread(new Subtractor(number1, number2));
			adderThread = new Thread(new Adder(number1, number2));
			multiplierThread = new Thread(new Multiplier(number1, number2));
			dividerThread = new Thread(new Divider(number1, number2));
			
			subtractThread.start();
			adderThread.start();
			multiplierThread.start();
			dividerThread.start();
		}
	}

}
