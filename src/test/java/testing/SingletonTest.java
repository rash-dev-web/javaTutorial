package testing;

public class SingletonTest {

	private static SingletonTest obj;

	// private constructor
	private SingletonTest() {

	}

	public static SingletonTest getObj() {
		if (obj == null) {
			obj = new SingletonTest();
		}
		return obj;
	}

	public static void main(String[] args) {
		SingletonTest st = SingletonTest.getObj();
	}
}
