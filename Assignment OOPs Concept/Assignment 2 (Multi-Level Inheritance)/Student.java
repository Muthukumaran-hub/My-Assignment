package org.student;

//import org.college.College;
import org.department.Department;

public class Student extends Department {
	public void studentName() {
		System.out.println("Student Name is ' Kumaran '");
	}
	public void StudentDept() {
		System.out.println("Student kumaran is Studying in CSE Department");
	}
	public void studentId() {
		System.out.println("4574 is Kumaran's Student Id");
	}
	public static void main(String[] args) {
		Student MultilevelInheritance = new Student();
		MultilevelInheritance.collegeName();
		MultilevelInheritance.collegeCode();
		MultilevelInheritance.collegeRank();
		MultilevelInheritance.deptName();
		MultilevelInheritance.studentName();
		MultilevelInheritance.StudentDept();
		MultilevelInheritance.studentId();
	}

}
