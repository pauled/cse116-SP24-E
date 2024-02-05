package week3;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
public class TestCode {
    @Test
    public void testAddPositives(){
        assertTrue(CodeToTest.add(1,2) == 3);
        assertTrue(CodeToTest.add(10,5) == 15);
        assertTrue(CodeToTest.add(5,5) == 10);
    }
    @Test
    public void testAddNegatives(){
        assertTrue(CodeToTest.add(-11,2) == -9);
        assertTrue(CodeToTest.add(-11,20) == 15);
        assertTrue(CodeToTest.add(10,-5) == 10);
        assertTrue(CodeToTest.add(10,-15) == -5);
        assertTrue(CodeToTest.add(-11,20) == 15);
        assertTrue(CodeToTest.add(-5,-5) == -10);
        assertTrue(CodeToTest.add(-6,-5) == -11);
        assertTrue(CodeToTest.add(-2,-6) == -8);
        assertTrue(CodeToTest.add(5,-5) == 0);
    }
}
