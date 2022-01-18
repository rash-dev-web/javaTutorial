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
//		System.out.println("Gender: " + this.gender);
//		System.out.println("Age: " + this.age);
//		System.out.println("Phone: " + this.phone);
//		System.out.println("GPA: " + this.gpa);
//		System.out.println("Degree: " + this.degree);
		System.out.println("Student Count: " + studentCount);
		System.out.println();

	}

	public static void main(String[] args) {

		Student st1 = new Student(1, "Mir", "M", 21, 8765432109l, 3.4, 'A');
		Student st2 = new Student(2, "Ayan", "M", 21, 8765432109l, 3.4, 'A');
		Student st3 = new Student(3, "Ali", "M", 21, 8765432109l, 3.4, 'A');
		
		System.out.println(st1.name);
//		System.out.println(st2.name);
		System.out.println(st3.name);
		Student[] students = {st1, st2, st3};
		st2 = st1;
		st1 = st3;
		st3 = st2;
		System.out.println();
		System.out.println(st1.name);
//		System.out.println(st2.name);
		System.out.println(st3.name);
		
	}
}
