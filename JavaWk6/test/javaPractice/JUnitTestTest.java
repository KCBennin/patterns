
package javaPractice;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class JUnitTestTest {
    
    public JUnitTestTest() {
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
     * Test of square method, of class JUnitTest.
     */
    @Test
    public void testSquare() {
        System.out.println("square");
        int x = 0;
        JUnitTest instance = new JUnitTest();
        int expResult = 0;
        int result = instance.square(x);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of countA method, of class JUnitTest.
     */
    @Test
    public void testCountA() {
        System.out.println("countA");
        String word = "";
        JUnitTest instance = new JUnitTest();
        int expResult = 0;
        int result = instance.countA(word);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
