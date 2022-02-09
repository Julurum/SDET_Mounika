package com.devlabs.assignment3;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListAlphabetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("Kavya");
		names.add("Manoj");
		names.add("Pavan");
		names.add("Padma");
		names.add("Geetha");
		names.add("Mouni");

		Collections.sort(names);
	    System.out.println(names);


	}

}
