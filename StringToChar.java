package com.devlabs.assignment2;

public class StringToChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        String str = "SANDEEP KUMAR";
        char[] ch = new char[str.length()]; 
        for (int i = 0; i < str.length(); i++) 
        { 
            ch[i] = str.charAt(i); 
        }
        for (char c : ch)
        { 
            System.out.println(c); 

        }
	}

}

