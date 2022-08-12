package testing;

public class Lambo extends Car{

	public void accelerate(int speedLimit) {
		System.out.println("lambo int");
	}
	public void accelerate() {
		System.out.println("lambo");
	}
	public static void main(String[] args) {
		Lambo obj = new Lambo();
		obj.accelerate();
		obj.accelerate(1);
		
		Car obj1 = new Lambo();
		obj1.accelerate();
	}
}
