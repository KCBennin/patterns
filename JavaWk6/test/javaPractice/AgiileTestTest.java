/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaPractice;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author kuuku
 */
public class AgiileTestTest {
    
    public AgiileTestTest() {
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

    /**
     * Test of add method, of class AgiileTest.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        String s1 = "";
        String s2 = "";
        AgiileTest instance = new AgiileTest();
        int expResult = 0;
        int result = instance.add(s1, s2);
        assertEquals(expResult, result);
        
    }
    
}
