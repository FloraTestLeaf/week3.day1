package week3.day1.methodoverload;

public class Student {

//	
//
//    Class: Students
//    Methods: getStudentInfo()
//
//Description: 
//Create multiple getStudentInfo() method by passing id argument alone, by id & name, by email & phoneNumber
	
	
	private void getStudentInfo(int id) {
		// TODO Auto-generated method stub
System.out.println("id");
	}
	
	private void getStudentInfo(int id, String name) {
		// TODO Auto-generated method stub
System.out.println("id"+"name");
	}
	
	private void getStudentInfo(String email,int phoneNumber) {
		// TODO Auto-generated method stub
System.out.println("email"+"ph");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student s=new Student();
s.getStudentInfo(2344);
s.getStudentInfo("eva@123", 545677);
s.getStudentInfo(3, "flo");

	}

}
