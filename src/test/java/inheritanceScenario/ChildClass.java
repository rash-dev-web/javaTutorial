package inheritanceScenario;

public class ChildClass extends ParentClass {

	@Override
	public void getData() {
		System.out.println("Child Class!");
	}

	public static void main(String[] args) {

		ParentClass obj1 = new ParentClass();
		obj1.getData();

		ParentClass obj2 = new ChildClass();
		obj2.getData();
	}

}
