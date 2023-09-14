package tddcourse;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class TestEvenNumber {
	@Test
	void successEvenNumber() {
		boolean result = EvenNumber.checkNumIsEven(4 );
		assertEquals(true, result);
	}
	
	@Test
	void successOddNumber() {
		boolean result = EvenNumber.checkNumIsEven(3);
		assertEquals(false,result);
	}

	@Test
	void negativeNumberReturnFalse() {
		boolean result = EvenNumber.checkNumIsEven(-4);
		assertEquals(false,result);
	}

}
