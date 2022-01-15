package section3;

public class TypeCasting {

	public static void main(String[] args) {

		// Implicit - smaller to larger - widening
		int x = 65;
		long y = x;
		System.out.println("y: " + y);

		int a = 13;
		float b = a;
		System.out.println("b: " + b);
		
		// Explicit - larger to smaller - narrowing
		long c = 64;
		int d = (int)c;
		System.out.println("d: " + d);
		
		byte e = 65;
		char f = (char)e;
		System.out.println("f: " + f);
		
		char g = 65;
		System.out.println("g: " + g);
		
		short h = 'A';
		System.out.println("h: " + h);
		
		double avg = (2+3)/2;
		System.out.println("avg: " + avg);
		
		double aveg = (double)(2+3)/2;
		System.out.println("avg: " + aveg);
		
	}
}
