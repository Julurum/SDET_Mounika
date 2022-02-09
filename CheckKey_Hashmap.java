package com.devlabs.assignment3;

import java.util.Hashtable;

public class CheckKeyOfHashtableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	    Hashtable ht = new Hashtable();
	   
	    ht.put("1","One");
	    ht.put("2","Two");
	    ht.put("3","Three");
	   
	    
	    boolean blnExists = ht.containsKey("2");
	    System.out.println("2 exists in Hashtable ? : " + blnExists);
	    
	    
	    boolean blnExists1 = ht.containsKey("5");
	    System.out.println("5 exists in Hashtable ? : " + blnExists1);
	    
	  }
	}
