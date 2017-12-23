/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import static org.junit.Assert.assertEquals;

import org.configuration.classes.Class1;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;

import org.configuration.classes.*;

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
        Class1.main(args);
        
        System.out.println("main");
        
        String nc = systemOutRule.getLog();
        systemOutRule.clearLog();
        
        Class2.main(args);
        
        System.out.println("main");
        String ss = systemOutRule.getLog();
        
        assertEquals(ss, nc);
    }
    
    
}
