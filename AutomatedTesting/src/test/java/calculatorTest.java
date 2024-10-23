import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import calculatorProject.Calculator;

public class calculatorTest {
	Calculator c; 
	@Before
	public void setUp() {
		c = new Calculator();
	}
	
	
	@Test
	public void substractTwoNumbers() {
		assertEquals(5, c.substract(15, 10));
	}
	
	@Test
	public void addTwoNumbers() {
		assertEquals(20, c.add(10, 10));
		System.out.println("himansu");
	}
	
}
