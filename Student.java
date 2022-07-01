package week3.day1.org.student;

import week3.day1.org.department.Department;

public class Student extends Department{
	
	public void studentName(){
		// TODO Auto-generated method stub
System.out.println("name is lora");
	}
	
	private void studentDept() {
		// TODO Auto-generated method stub
System.out.println("civil");
	}
	
	private void studentId() {
		// TODO Auto-generated method stub
System.out.println("2433106");
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student s=new Student();
s.studentName();
s.studentDept();
s.studentId();
s.deptName();
s.collegeCode();
s.collegeName();
s.collegeRank();
s.evana();//recent ah ula evana dan edukum

	}

}
