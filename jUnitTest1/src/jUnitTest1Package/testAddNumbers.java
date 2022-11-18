package jUnitTest1Package;

import static org.junit.Assert.*;

import org.junit.Test;



public class testAddNumbers {

	@Test
	public void test() {
			jUnitFunction1 junit = new jUnitFunction1();
			int result = junit.addNumbers(100, 400);
			assertEquals (300, result);
		}

}
