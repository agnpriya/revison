package com.aipalbot.revison.programs;

import java.util.Scanner;

public class Grading {
	
	public String grade()
	{
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter Student marks: ");
	int marks = scanner.nextInt();
     String grade = " ";
	
	if(marks>=0 && marks<=39) grade = "F";
	else if (marks>=40 && marks<=49) grade = "E";
	else if (marks>=50 && marks<=59) grade = "D";
	else if (marks>=60 && marks<=69) grade = "C";
	else if (marks>=70 && marks<=85) grade = "B";
	else if (marks>=86 && marks<=100) grade = "A";
	
	System.out.println("The Student grade is : " +grade);
	return grade;
	}
}
