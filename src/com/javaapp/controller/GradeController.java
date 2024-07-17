package com.javaapp.controller;

import java.util.Scanner;

import com.javaapp.exceptions.IllegalMarksException;
import com.javaapp.service.GradeService;

public class GradeController {
	
	public static void main(String[] args) {

		double totalMarks = 300;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter marks of subject 1 : ");
		double marks1 = sc.nextDouble();
		
		System.out.println("Enter marks of subject 2 : ");
		double marks2 = sc.nextDouble();
		
		System.out.println("Enter marks of subject 3 : ");
		double marks3 = sc.nextDouble();
		
//		 To reach out to Service class
		GradeService gradeService = new GradeService();
		
//		Give inputs given by the user to service
//		service must do the required processing and return the grade
		
//		once get the grade, display it

			try {
				String grade = gradeService.computeGrade(marks1, marks2, marks3, totalMarks);
				System.out.println("Your grade is: " + grade);
			} catch (IllegalMarksException e) {
				System.out.println(e.getMessage());
			}
		
		
		
		System.out.println("Thankyou....");
	}
}

/* JVM : Java Virtual Machine */

// main method

/* Read marks of 3 subjects from the User.abstract
* Add them and compute total
* based on this total, compute percent as per following criteria.
* percent >=75 : Grade A
* percent >=60 : Grade B
* else Grade C
*
* No validations to be considered as Exceptions are not covered yet
*/