package importTest;

import org.testng.annotations.Test;

public class WithOutStaticImportTest {

	@Test
	public void test() {
		System.out.println(Math.random());
		System.out.println(Math.sqrt(16));
		System.out.println(Math.min(5, 12));
	}
}
