package com.aipalbot.revison;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       /* System.out.println( "Hello World!" );
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter value for X: ");
        
        int x = scanner.nextInt();
        
        
        
        System.out.println("Enter value for X: ");
        
        int y = scanner.nextInt();
        
        
        double xy = Math.pow(x, 2)+3*1-3*y-3*x;
        
        
        System.out.println("Result: "+xy);
        
        */
    	
    	Scanner scanner = new Scanner(System.in);
    	int marks = scanner.nextInt();
         String grade = " ";
    	
    	if(marks>=0 && marks<=39) grade = "F";
    	else if (marks>=40 && marks<=49) grade = "E";
    	else if (marks>=50 && marks<=59) grade = "D";
    	else if (marks>=60 && marks<=69) grade = "C";
    	else if (marks>=70 && marks<=85) grade = "B";
    	else if (marks>=86 && marks<=100) grade = "A";
    	
    	System.out.println("The Student grade is : " +grade);
    		
    }
}
