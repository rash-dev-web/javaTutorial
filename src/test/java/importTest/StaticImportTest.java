package importTest;

import org.testng.annotations.Test;
import static java.lang.Math.random;
import static java.lang.Math.*;

public class StaticImportTest {
	
	@Test
	public void test() {
		System.out.println(random());
		System.out.println(sqrt(16));
		System.out.println(min(5, 12));
	}

}
