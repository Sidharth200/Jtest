package jUnitTest1Package;

import static org.junit.Assert.*;

import org.junit.Test;



public class testAddStrings {

	@Test
	public void test() {
		jUnitFunction1 junitstring = new jUnitFunction1();
		String result = junitstring.addStrings("Sidharth", "Lohchab");
		assertEquals("SidharthLohchab", result);
	}

}
