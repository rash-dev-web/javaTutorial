package misc;

public class PrintAlphabet {

	public static void main(String[] args) {
		
		char c = 'A';
		int num = 1;
		for(char ch = c; ch<='Z';ch++) {
			System.out.print(ch);
			System.out.print(num);
			num++;
		}
	}
}
