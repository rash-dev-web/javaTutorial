package constructors;

public class ConstructorTest {

	double height;
	double width;

	public ConstructorTest() {
		System.out.println("Constructor Test!");
		height = 20;
		width = 15; 
		System.out.println("Height: " + height);
		System.out.println("Width: " + width);
	}
	
	public ConstructorTest(double height, double width) {
		System.out.println("Parameterized Constructor Test!");
		this.height = height;
		this.width = width; 
		System.out.println("Height: " + height);
		System.out.println("Width: " + width);
	}

	public static void main(String[] args) {
		ConstructorTest obj = new ConstructorTest(); 
		/*output: 
		Constructor Test!
		Height: 20.0
		Width: 15.0*/
		ConstructorTest obj1 = new ConstructorTest(5, 12);
		/*output
		Constructor Test!
		Height: 5.0
		Width: 12.0*/
	}
}
