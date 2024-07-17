package com.javaapp.service;

public class GradeService {

	public String computeGrade(double marks1, double marks2, double marks3, double totalMarks) {
		// TODO Auto-generated method stub
		
		double marksScored = marks1 + marks2 + marks3;
		double percent = (marksScored * 100) / totalMarks;
		
		if(percent >= 75)
			return "A";
		if(percent >= 60)
			return "B";
		return "C";
	}

}
