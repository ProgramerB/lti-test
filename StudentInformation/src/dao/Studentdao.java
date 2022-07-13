package dao;
import java.util.List;
import model.Student;
import model.Registeration;
public interface Studentdao {
	Student addNewStudent(Student student);
	Student updateStudentProfile(Student student);
	boolean registeration(Registeration registeration);
	Student findAStudentByRollNo(int rollNo);
	List<Student> viewAllStudents();
}
