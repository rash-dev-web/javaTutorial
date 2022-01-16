package section3;

public class MethodOverloading {

	public static void go(int[] arr) {

		System.out.println("arr[0] " + arr[0]);
		System.out.println("arr[1] " + arr[1]);
		arr[1] = 22;
	}

	public static void go(int value) {

		System.out.println("value " + value);
	}
	
	public static void go(short value) {
		System.out.println("in short...");
		System.out.println("value " + value);
	}

	public static void main(String[] args) {

		int[] arr = { 1, 2 };
		go(arr);
		System.out.println("arr[1] " + arr[1]);
		
		go(1000);
		byte b = 50;
		go(b);
	}
}
