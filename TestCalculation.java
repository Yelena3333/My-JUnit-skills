package Calc;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestCalculation {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Set up before class");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Tear down after class");
	}

	private Calculation c;

	@Before
	public void setUp() throws Exception {
		System.out.println("Before");
		c = new Calculation();
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("After");
	}

	@Test
	public void testAdd() {
		assertEquals(7, c.add(5, 2));
	}

	@Test
	public void testDiv() {
		assertEquals(2, c.div(10, 5));
	}

	@Test(expected = ArithmeticException.class)
	public void testDiv2() {
		c.div(14, 0);
	}

}
