package basicmavenproject;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class MainTest {
	
	Main mainobj;
	@Before
	public void setUp() throws Exception {
		System.out.println("Setting up..");
		mainobj = new Main();
		
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Tearing down ..");
		mainobj = null;
	}

	@Test
	public void testPrintHelloPositive() {
		assertEquals("Your method returns Hello","Hello",mainobj.printHello());
		
	}
	
	@Ignore
	@Test
	public void testPrintHelloNegative() {
		assertEquals("Your method returns Hello","hi",mainobj.printHello());
		fail("Not yet implemented");
	}
	
}
