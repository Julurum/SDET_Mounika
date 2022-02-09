package com.devlabs.assignment1;

import java.util.Scanner;

public class LeapYearNumber {

    public static void main(String[] args) {
          // TODO Auto-generated method stub
          Scanner scan = new Scanner(System.in);
     System.out.println("Please enter the year:");
     int year = scan.nextInt();
     scan.close();
     
     if (year%4==0) {
          System.out.println(year+ "is leap year");
     }
          else {
                 System.out.println(year+ "is not a leap year");      
          }
     }
    }


