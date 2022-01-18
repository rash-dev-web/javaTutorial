package section3;

public class Student {

	static int studentCount;
	int id;
	String name;
	String gender;
	int age;
	long phone;
	double gpa;
	char degree;

	boolean international;
	double tutionFee = 10000.0;
	double internationalFee = 5000.0;

	Student() {

	}

	public Student(int id, String name, String gender, int age, long phone, double gpa, char degree) {
		this(id, name, gender, age, phone, gpa, degree, false);
	}

	public Student(int id, String name, String gender, int age, long phone, double gpa, char degree,
			boolean international) {
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.phone = phone;
		this.gpa = gpa;
		this.degree = degree;
		this.international = international;

		studentCount = studentCount + 1;

		if (international) {
			tutionFee = tutionFee + internationalFee;
		}

		System.out.println("Id: " + this.id);
		System.out.println("Name: " + this.name);
		System.out.println("Gender: " + this.gender);
		System.out.println("Age: " + this.age);
		System.out.println("Phone: " + this.phone);
		System.out.println("GPA: " + this.gpa);
		System.out.println("Degree: " + this.degree);

	}

	public static void main(String[] args) {

		Student st1 = new Student(1, "Mir", "M", 21, 8765432109l, 3.4, 'A');
	}
}
