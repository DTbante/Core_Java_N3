package org.tnsif.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
// program to demonstrate assertion annotations
class JunitAssertionDemo {

	@Test
	void test() {
		// Fails when expected does not equal actual
		assertEquals(12,12);
	}
	@Test
	void display() {
		// fails when expression is true
		assertFalse(12==1);
	}

}
