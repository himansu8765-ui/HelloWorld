import static org.junit.Assert.*;

import org.junit.Test;

public class multiplicationTest {
	
	@Test
	public void multiplyTwoNumber() {
		int num1 = 5;
		int num2= 10;
		int mul = num1 * num2;
		System.out.println(mul);
		assertEquals(mul, 50);
	}
}
