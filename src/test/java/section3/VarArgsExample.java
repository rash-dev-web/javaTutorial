package section3;

public class VarArgsExample {

	static void foo(boolean flag, int... items) {
		System.out.println("flag: " + flag);
		System.out.println("items: " + items[0]);
	}

	public static void main(String[] args) {
		
		foo(true, new int[] {1,2,3});
		foo(true, 1,2,3);
		foo(true);

	}

}
