package section3;

public class Student {
	
	static int studenCount;
	int id;
	String name;
	String gender;
	int age;
	long phone;
	long gpa;
	char degree;
	boolean international;
	
	
	double tutionFee = 10000;
	double internationalFee = 5000;
	
	Student(){
		
	}
	
	public Student(int newId, String newName) {
		id = newId;
		name = newName;
	}

	public static void main(String[] args) {
		
	}
}
