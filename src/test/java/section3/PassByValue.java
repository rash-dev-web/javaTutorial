package section3;

public class PassByValue {

	public static void go(int[] arr) {
		
		System.out.println("arr[0] " + arr[0]);
		System.out.println("arr[1] " + arr[1]);
		arr[1] = 22;
	}

	public static void main(String[] args) {

		int[] arr = { 1, 2 };
		go(arr);
		System.out.println("arr[1] " + arr[1]);
	}
}
