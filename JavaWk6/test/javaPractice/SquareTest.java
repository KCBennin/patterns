
package javaPractice;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class SquareTest {
    
   
    @Test
    public void test() {
        
        JUnitTest test = new JUnitTest();
        
        int output = test.square(5);
        
        assertEquals(25, output);
    }
    
}
