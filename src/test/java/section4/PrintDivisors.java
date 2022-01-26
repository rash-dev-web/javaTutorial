package section4;

public class PrintDivisors {

	public static void main(String[] args) {

		int num = 24;
		for (int x = 1; x < num ; x++) {
			if (num % x == 0)
				System.out.println(x);
		}
	}

}
