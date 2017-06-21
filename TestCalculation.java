package Calc;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestCalculation {

	private Calculation c;
	private static int testNumber = 0;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Start all tests execution...");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("End all tests!");
	}

	@Before
	public void setUp() throws Exception {
		testNumber++;
		System.out.println("Perform pre-condition for test" + testNumber);
		c = new Calculation();
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Perform post-condition for test" + testNumber);
	}

	@Test
	public void testAdd() {
		assertEquals("Add simple digits: ", 7, c.add(5, 2));
	}

	@Test
	public void testDiv() {
		assertEquals("Divide simple digits: ", 2, c.div(10, 5));
	}

	@Test(expected = ArithmeticException.class)
	public void testDiv2() {
		c.div(14, 0);
	}

}
