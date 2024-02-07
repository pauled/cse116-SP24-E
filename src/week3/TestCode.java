package week3;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class TestCode {
    @Test
    public void testAddPositives(){
        assertEquals(CodeToTest.add(1,2),3);
        assertEquals(CodeToTest.add(10,5),15);
        assertEquals(CodeToTest.add(5,5),10);
    }
    @Test
    public void testAddNegatives(){
        assertEquals(CodeToTest.add(-11,2),-9);
        int actual=CodeToTest.add(-11,20);
        assertEquals("Expected 15 on -11,20 got: "+actual,15,actual);
        assertEquals(CodeToTest.add(10,-5),10);
        assertEquals(CodeToTest.add(10,-15),-5);
        assertEquals(CodeToTest.add(-11,20),15);
        assertEquals(CodeToTest.add(-5,-5),-10);
        assertEquals(CodeToTest.add(-6,-5),-11);
        assertEquals(CodeToTest.add(-2,-6),-8);
        assertEquals(CodeToTest.add(5,-5),0);
    }
    @Test
    public void testString(){
        String a="hello ";
        String b="goodbye";
        String c=a+b;
        assertEquals(c,"hello goodbye");
    }
}
