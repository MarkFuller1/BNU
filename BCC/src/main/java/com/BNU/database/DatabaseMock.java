package com.BNU.database;

import java.awt.LayoutManager;
import java.util.ArrayList;

import com.BNU.pages.classesByTeacher.Course;
import com.BNU.pages.teachersByClass.Professor;

public class DatabaseMock implements dbWrapper{
	
	@Override
	public String[] getAllProfessors() {
		String [] professors = new String[3];
		professors[0] = "Dr. Nikola Tesla";
		professors[1] = "Dr. Thomas Edison";
		professors[2] = "Dr. Alexander Grahm-Bell";
		
		return professors;
	}

	@Override
	public String[] getAllClasses() {
		String [] classes = new String[3];
		classes[0] = "Adventures in Multi-Threading";
		classes[1] = "Quantum Computing for Beginners";
		classes[2] = "Intro to GoLang";
		
		return classes;
	}

	@Override
	public String[] getPossibleClasses() {
		String [] classes = new String[16];
		classes[0] = "CSI 1430";
		classes[1] = "CSI 1440";
		classes[2] = "CSI 2350";		
		classes[3] = "CSI 2334";
		classes[4] = "CSI 3334";
		classes[5] = "CSI 3471";		
		classes[6] = "CSI 3344";
		classes[7] = "CSI 3336";
		classes[8] = "CSI 3335";		
		classes[9] = "CSI 3372";
		classes[10] = "CSI 3439";
		classes[11] = "CSI 4337";	
		classes[12] = "CSI 4321";
		classes[13] = "PHI 1310";
		classes[14] = "CSI 43C9";
		classes[15] = "CSI 4330";
		return classes;
	}

	public String[] getAllProfessorsForClass(String className) {
		String [] a = {"Dr. Nikola Tesla", "Dr. Thomas Edison", "Dr. Alexander Grahm-Bell"};
		String [] b = {"Dr. Nikola Tesla", "Dr. Thomas Edison", "Dr. Alexander Grahm-Bell"};
		String [] c = {"Dr. Nikola Tesla", "Dr. Thomas Edison", "Dr. Alexander Grahm-Bell"};
		
		switch(className) {
		case "Adventures in Multi-Threading":
			return a;
		case "Quantum Computing for Beginners":
			return b;
		case "Intro to GoLang":
			return c;
		}
		return null;
	}

	@Override
	public Professor getProfessor(String prof) {
		ArrayList<Professor> profs = new ArrayList<>();
		String [] courses = {"Adventures in Multi-Threading", "Quantum Computing for Beginners", "Intro to GoLang"};
		
		profs.add(new Professor("Dr. Nikola Tesla",  "99", "4", courses));
		profs.add(new Professor("Dr. Thomas Edison",  "99", "4", courses));
		profs.add(new Professor("Dr. Alexander Grahm-Bell",  "99", "4", courses));
		
		switch(prof) {
		case "Dr. Nikola Tesla":
			return profs.get(0);
		case "Dr. Thomas Edison":
			return profs.get(1);
		case "Dr. Alexander Grahm-Bell":
			return profs.get(2);
			
		}
		return null;
	}

	@Override
	public String[] getAllClassesForProfessor(String professorName) {
		String [] a = {"Adventures in Multi-Threading", "Quantum Computing for Beginners", "Intro to GoLang"};
		String [] b = {"Adventures in Multi-Threading", "Quantum Computing for Beginners", "Intro to GoLang"};
		String [] c = {"Adventures in Multi-Threading", "Quantum Computing for Beginners", "Intro to GoLang"};
		System.out.println(professorName);
		switch(professorName) {
		case "Dr. Nikola Tesla":
			return a;
		case "Dr. Thomas Edison":
			return b;
		case "Dr. Alexander Grahm-Bell":
			return c;
		}
		return null;
	}
	
	@Override
	public Course getCourse(String course) {
		ArrayList<Course> courses = new ArrayList<>();
		String [] profs = {"Dr. Nikola Tesla", "Dr. Thomas Edison", "Dr. Alexander Grahm-Bell"};
		
		courses.add(new Course("Adventures in Multi-Threading",  "99", "4", profs));
		courses.add(new Course("Quantum Computing for Beginners",  "99", "4", profs));
		courses.add(new Course("Intro to GoLang",  "99", "4", profs));
		
		switch(course) {
		case "Adventures in Multi-Threading":
			return courses.get(0);
		case "Quantum Computing for Beginners":
			return courses.get(1);
		case "Intro to GoLang":
			return courses.get(2);
			
		}
		return null;
	}
}
