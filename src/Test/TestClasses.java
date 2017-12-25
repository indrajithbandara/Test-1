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
        String[] args = null;
        org.configuration.class1.Class.main(args);
        
        
        String nc = systemOutRule.getLog();
        systemOutRule.clearLog();
        
        org.configuration.class2.Class.main(args);
        
        String ss = systemOutRule.getLog();
        
        assertEquals(ss, nc);
    
}

    @Test
    public void testMain2() {

        long startTime = System.currentTimeMillis();

		org.configuration.class1.Class.main(null);

		long endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println("\nRun time "+totalTime+" second");

    }
    @Test
    public void testMain3() {

        long startTime = System.currentTimeMillis();

		org.configuration.class2.Class.main(null);

		long endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println("\nRun time "+totalTime+ "seconds");

    }
    
    
}