package com.devlabs.assignment1;

import java.util.Scanner;

public class FactorialOfNumberUsingWhileLoop {

    public static void main(String[] args) {
          // TODO Auto-generated method stub
          Scanner scan = new Scanner(System.in);
     System.out.println("Please enter the number:");
     int num = scan.nextInt();
     
     scan.close();
     int i = 1;
     int fact = 1 ;
     while(i<=num){
     fact = fact*i;
     i++;
     }
     System.out.println("Factorial of the number "+num+" is" +fact);
    }

}
