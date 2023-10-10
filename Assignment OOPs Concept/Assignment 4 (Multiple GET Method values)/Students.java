package org.system;

public class Students {
/////////////............CREATING MULTIPLE getStudentInfo() BY PASSING MULTIPLE ARGS... ...................///////////////////
	public void getStudentInfo() {
		System.out.println("\n");
	}
public void getStudentInfo(int id,String name) {
		System.out.println("Student ID:" +id+ "\n"+ "Student Name:" +name);
	}
public void getStudentInfo(String eMail, String mobileNumber) {
	System.out.println("Student Email ID:" +eMail+ "\n"+ "Student Mobile Number:" +mobileNumber);
}
public static void main(String[] args) {
	Students studentInformation = new Students();
	studentInformation.getStudentInfo();
	studentInformation.getStudentInfo(27, "Muthukumaran");
	studentInformation.getStudentInfo("subramuthu99@gmail.com", "6381091717");
}

}
