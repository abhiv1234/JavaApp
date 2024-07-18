package com.javaapp.service;

import com.javaapp.exceptions.IllegalMarksException;

public class GradeService {

	public String computeGrade(double marks1, double marks2, double marks3, double totalMarks) throws IllegalMarksException {
//		Validate inputs
		
////		UncheckedException --> superclass is RuntimeException
//		if(marks1>100 || marks1<0) {
//			throw new IllegalArgumentException("Illegal marks1 value");
//		}
//		if(marks2>100 || marks2<0) {
//			throw new IllegalArgumentException("Illegal marks2 value");
//		}
//		if(marks3>100 || marks3<0) {
//			throw new IllegalArgumentException("Illegal marks3 value");
//		}
		
 ////		Checked Exception --> Superclass is Exception
//		if(marks1>100 || marks1<0) {
//			throw new Exception("Illegal marks1 value");
//		}
//		if(marks2>100 || marks2<0) {
//			throw new Exception("Illegal marks2 value");
//		}
//		if(marks3>100 || marks3<0) {
//			throw new Exception("Illegal marks3 value");
//		}
		
		if(marks1>100 || marks1<0) {
			throw new IllegalMarksException("Illegal marks1 value");
		}
		if(marks2>100 || marks2<0) {
			throw new IllegalMarksException("Illegal marks2 value");
		}
		if(marks3>100 || marks3<0) {
			throw new IllegalMarksException("Illegal marks3 value");
		}
		double marksScored = marks1 + marks2 + marks3;
		double percent = (marksScored * 100) / totalMarks;
		
		if(percent >= 75)
			return "A";
		if(percent >= 60)
			return "B";
		return "C";
	}

}
