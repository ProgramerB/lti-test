package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Student;
import connection.OracleConnection;

public class StudentdaoDatabase{
	Connection conn;
	PreparedStatement ps;
	
	public StudentdaoDatabase() {
		conn = OracleConnection.getConnection();
	}
	
	@Override
	public void addNewStudent(Student student) {
		
		try {
			String sql = "insert into tbl_students values(?,?,?,?,?,?,?)";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, student.getRollNo());
			ps.setString(2,student.getName());
		}catch(SQLException e) {
			
		}
	}
	
	@Override
	public List<Student> viewAllStudents(){
		List<Student> students = new ArrayList<Student>();
		String sql = "select * from tbl_students";
		
		ResultSet rs = null;
		
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			
			Student st = null;
			
			while(rs.next()) {
				st = new Student();
				st.setRollNo(rs.getInt(1));
				
			}
		}catch() {
			
		}
		
	}
}
