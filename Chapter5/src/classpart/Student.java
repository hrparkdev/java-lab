package classpart;

public class Student {
	
	int studentID;
	String studentName;
	
	public void showStudentInfo() {
		System.out.println(studentName);
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}

}
