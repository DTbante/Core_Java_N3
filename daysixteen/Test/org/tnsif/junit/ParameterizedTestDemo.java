package org.tnsif.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
//program to demonstrate on Parameterized Test
class ParameterizedTestDemo {

	@ParameterizedTest
	@ValueSource(strings={"Nia","Diya"})
	void test() {
		System.out.println("hello");
	}
	@ParameterizedTest
	@ValueSource(strings={"Nia","Diya"})
	void display(String str) {
		assertNotNull(str);
	}

}
