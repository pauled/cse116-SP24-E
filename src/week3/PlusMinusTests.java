package week3;
import org.junit.Test;
import java.awt.*;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PlusMinusTests {
    @Test
    public void testDouble(){
        double bad=0;
        int size=10;
        for (int x=0;x<size;x++){
            bad+=.1;
        }
        System.out.println("bad: "+bad);
        assertEquals(1.0,bad,.001);
    }
    @Test
    public void testPMCommon(){
        String actual=PlusMinus.pm(87);
        assertEquals("input 87 expect:+ got:"+actual,"+",actual);
        actual=PlusMinus.pm(89);
        assertEquals("input 89 expect:+ got:"+actual,"+",actual);
        actual=PlusMinus.pm(76);
        assertEquals("input 76 expect:+ got:"+actual,"",actual);
        actual=PlusMinus.pm(73);
        assertEquals("input 73 expect:+ got:"+actual,"",actual);
        actual=PlusMinus.pm(62);
        assertEquals("input 62 expect:+ got:"+actual,"-",actual);
        actual=PlusMinus.pm(90);
        assertEquals("input 90 expect:+ got:"+actual,"-",actual);
    }
    @Test
    public void testPMUncommon(){
        String actual=PlusMinus.pm(101);
        assertEquals("input 101 expect:+ got:"+actual,"+",actual);
        actual=PlusMinus.pm(100);
        assertEquals("input 101 expect:+ got:"+actual,"+",actual);
        actual=PlusMinus.pm(9);
        assertEquals("input 9 expect:+ got:"+actual,"",actual);
    }
}
