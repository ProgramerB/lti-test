package model;
import java.time.LocalDate;

public class Registeration {
	int registerationNo;
	LocalDate registerationDate;
    int courseId;
    int rollNo;
    
    public Registeration() {
		super();
	}

	public Registeration(LocalDate registerationDate, int courseId, int rollNo) {
		super();
		this.registerationDate = registerationDate;
		this.courseId = courseId;
		this.rollNo = rollNo;
	}
    
	public int getRegisterationNo() {
		return registerationNo;
	}
	public void setRegisterationNo(int registerationNo) {
		this.registerationNo = registerationNo;
	}
	public LocalDate getRegisterationDate() {
		return registerationDate;
	}
	public void setRegisterationDate(LocalDate registerationDate) {
		this.registerationDate = registerationDate;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	
}
