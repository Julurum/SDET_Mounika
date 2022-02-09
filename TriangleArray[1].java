package com.devlabs.assignment1;

public class TriangleArray {

public static void printTriangleArray(int n)
{
int i, j;

for(i=0; i<n; i++)
{
for(j=0; j<=i; j++)
{

System.out.print("0 ");
}

System.out.println();
}
}

public static void main(String[] args) {

{
int n = 10;
printTriangleArray(n);
}
}
}
