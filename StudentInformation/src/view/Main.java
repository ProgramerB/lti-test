package view;

import java.util.Scanner;
import dao.Studentdao;
import dao.StudentUpdatedao;
import model.Student;

public class Main {

	public static void main(String[] args) {
		
		Studentdao dao=new StudentUpdatedao();
		
		Scanner sc = new Scanner(System.in);
		int rollNo = sc.nextInt();
		
		Student student = dao.findAStudentByRollNo(rollNo);
		if(student!=null) {
			System.out.println("Phoneno");
			String phNo = sc.next();
			student.setPhoneNo(phNo);
			dao.updateStudentProfile(student);
		}
		else {
			System.out.println("Student not found");
		}
	}

}
