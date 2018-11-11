package info.sjd;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppRunnerTest {

	@Test
	public void makeDivision(int dividend, int divisor) {

//		String i = AppRunner.makeDivision(dividend, divisor);

		assertNotNull(AppRunner.makeDivision(dividend, divisor));
//		assertTrue(AppRunner.makeDivision(dividend, divisor).equals("3258"));

	}

}
