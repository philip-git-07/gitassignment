package calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class calculatorTest
{

	@Test
	public void calculatorTestAddpass() {
		assertEquals("error in add()", 3, calculator.add(1, 2));
		assertEquals("error in add()", -3, calculator.add(-1, -2));
		assertEquals("error in add()", 9, calculator.add(9, 0));
		
	
	}
	@Test
	public void calculatorTestMulpass() {
		assertEquals("error in add()", 2, calculator.mul (1, 2));	
	}
	@Test
	public void calculatorTestSubPass() {
		assertEquals("error in sub()", -1, calculator.sub (1, 2));
		assertEquals("error in sub()", 1, calculator.sub (-1, -2));
		assertEquals("error in sub()", 0, calculator.sub (2, 2));
		assertEquals("error in sub()", -1, calculator.sub (1, 2));
	}
	@Test
	public void calculatorTestDivPass() {
		assertEquals("error in doublediv()", 1, calculator.div (2, 2),0.0001);
	}
}

