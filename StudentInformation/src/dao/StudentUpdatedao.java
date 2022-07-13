package dao;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import model.Registeration;
import model.Student;

public class StudentUpdatedao implements Studentdao {
	
	public static List<Student> students = new ArrayList<Student>();
	
	@Override
	public void addNewStudent(Student student) {
		students.add(student);
	}

	@Override
	public void updateStudentProfile(Student student) {
		// TODO Auto-generated method stub
		Student student1 = findAStudentByRollNo(student.getRollNo());
		int index;
		index = students.indexOf(student1);
		students.set(index, student1);
	}

	@Override
	public boolean registeration(Registeration registeration) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Student findAStudentByRollNo(int rollNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> viewAllStudents() {
		// TODO Auto-generated method stub
		return students.stream().collect(Collectors.toList());
	}

}
