package VJIT.TDD_JUnitTask;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

class DeleteCharATest {
	/*
	 * "ABCD"=>"BCD"
	 * "AACD"=>"CD"
	 * "BACD"=>"BCD"
	 * "BBAA"=>"BBAA"
	 * "AABAA"=>"BAA"
	 */
	@Test
	void testCase() {
		DelCharA c1=new DelCharA();
		assertEquals("BCD",c1.delete("ABCD"));
		assertEquals("CD",c1.delete("AACD"));
		assertEquals("BCD",c1.delete("BACD"));
		assertEquals("BBAA",c1.delete("BBAA"));
		assertEquals("BAA",c1.delete("AABAA"));
			}
}


