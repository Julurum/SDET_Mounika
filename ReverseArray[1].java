package com.devlabs.assignment1;

import java.util.Scanner;

public class ReverseArray {

       public static void main(String[] args) {
             // TODO Auto-generated method stub
             int i=0, j=0, temp;
             int number[] =new int[100];
             Scanner scan = new Scanner(System.in);
                System.out.println("Enter the elements of an array :");
             int counter =scan.nextInt();
             for(i=0; i<counter;i++)
             {
                    System.out.println("Enter array elements :"+(i+1)+": ");
                    number[i] = scan.nextInt();
             }
             j=i-1;
             i=0;
             scan.close();
             while(i<j) {
                    temp= number[i];
                    number[i]=number[j];
                    number[j]=temp;
                    i++;
                    j--;
                    
             }
             System.out.println("Reversed array:"); 
             for(i=0; i<counter; i++) {
                    System.out.println(number[i]+ " ");
             }
       }

}
