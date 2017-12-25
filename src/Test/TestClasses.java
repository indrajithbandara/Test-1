/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

/**
 *
 * @author hanan
 */
public class TestClasses {

	@Rule
	public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

	public void writesTextToSystemOut() {
		System.out.print("hello world");
		assertEquals("hello world", systemOutRule.getLog());
	}

	public TestClasses() {
	}

	@BeforeClass
	public static void setUpClass() {
	}

	@AfterClass
	public static void tearDownClass() {
	}

	@Before
	public void setUp() {
	}

	@After
	public void tearDown() {
	}

	@Test
	public void testMain() {

		String ss = "org.configuration.manager";
		String nc = "org.configuration.manager";
		assertEquals(ss, nc);

	}

	@Test
	public void testMain2() {
		String ss = "org.configuration.manager";
		String nc = "org.configuration.manager";
		assertEquals(ss, nc);
	}

	@Test
	public void testMain3() {
		String[] args = null;
		long startTime = System.currentTimeMillis();

		org.configuration.class1.Class.main(args);

		long endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;


		String nc = systemOutRule.getLog();
		System.out.println("Run time "+totalTime);

		systemOutRule.clearLog();
		startTime = System.currentTimeMillis();

		org.configuration.class2.Class.main(args);

		endTime = System.currentTimeMillis();
		totalTime = endTime - startTime;


		String ss = systemOutRule.getLog();
		System.out.println("Run time "+totalTime);

		assertEquals(ss, nc);
	}

}
