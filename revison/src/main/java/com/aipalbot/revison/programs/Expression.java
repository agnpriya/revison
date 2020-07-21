package com.aipalbot.revison.programs;

import java.util.Scanner;

public class Expression {
	
	public double result()
	{

	Scanner scanner = new Scanner(System.in);
    
    System.out.println("Enter value for X: ");
    
    int x = scanner.nextInt();
  
    
    
    
    System.out.println("Enter value for y: ");
    
    int y = scanner.nextInt();
    
    
    double xy = Math.pow(x, 2)+3*1-3*y-3*x;
    
    
    System.out.println("Result: "+xy);
    
    return xy;
	}
}
