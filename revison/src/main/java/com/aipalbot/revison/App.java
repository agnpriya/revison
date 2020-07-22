package com.aipalbot.revison;

import java.util.Scanner;

import com.aipalbot.revison.programs.ArrayExample;
import com.aipalbot.revison.programs.Expression;
import com.aipalbot.revison.programs.Grading;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       
    	Expression exp = new Expression();
    	System.out.println("Result of expression x2+3*1-3*y-3*x"+exp.result());
    	
    	Grading gd = new Grading();
    	gd.grade();
    	
    	ArrayExample a = new ArrayExample();
    	 a.calculateAmount();
    }
}
