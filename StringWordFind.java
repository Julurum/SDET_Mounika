package com.devlabs.assignment2;

import java.util.Arrays;
import java.util.Scanner;

public class StringWordFind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		String str;
        Scanner S = new Scanner(System.in);
        System.out.print("Enter the string you want to check:");
        str = S.nextLine();
		//String[] splited = str.split("\\b+"); //split on word boundries
		//Arrays.asList(splited).contains("brown"); //search array for word

		if(str.contains("brown"))
		{
			System.out.println("Brown is Presnt in String");
		}
		
		else
		{
			System.out.println("Brown is NOT Presnt in String");

		}
		
		
	}
	

}
