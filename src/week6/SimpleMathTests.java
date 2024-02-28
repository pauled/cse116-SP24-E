package week6;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;
public class SimpleMathTests {
    @Test
    public void testFactorialCommon(){
        HashMap<Integer,Integer> testCases=new HashMap<>();

        testCases.put(1,1);
        testCases.put(2,2);
        testCases.put(3,6);
        testCases.put(4,24);
        testCases.put(5,120);
        testCases.put(6,720);
        testCases.put(7,5040);
        testCases.put(8,40320);
        testCases.put(9,362880);

        for (int input : testCases.keySet()){
            int expectedOut=testCases.getOrDefault(input,-1);
            int actual=SimpleMath.factorial(input);
            assertEquals("input: "+input,expectedOut,actual);
        }
    }
    @Test
    public void testFactorialUncommon() {
        HashMap<Integer, Integer> testCases = new HashMap<>();

        testCases.put(1, 1);
        testCases.put(2, 2);

        for (int input : testCases.keySet()) {
            int expectedOut = testCases.getOrDefault(input, -1);
            int actual = SimpleMath.factorial(input);
            assertEquals("input: " + input, expectedOut, actual);
        }
    }
    @Test
    public void testFactorialEdgeCases() {
        HashMap<Integer, Integer> testCases = new HashMap<>();

        testCases.put(1, 1);
        testCases.put(2, 2);
        testCases.put(3, 6);
        testCases.put(4, 24);
        testCases.put(5, 120);
        testCases.put(6, 720);
        testCases.put(7, 5040);
        testCases.put(8, 40320);
        testCases.put(9, 362880);

        for (int input : testCases.keySet()) {
            int expectedOut = testCases.getOrDefault(input, -1);
            int actual = SimpleMath.factorial(input);
            assertEquals("input: " + input, expectedOut, actual);
        }
    }
    @Test
    public void testMultiply(){
        ArrayList<MultiplyTestCase> testCases = new ArrayList<>(
                Arrays.asList(
                    new MultiplyTestCase( 1,1 ,1 ),
                        new MultiplyTestCase(10 ,5 ,50 ),
                        new MultiplyTestCase(100 ,100 ,10000 ),
                        new MultiplyTestCase(-5 ,-6 ,30 ),
                        new MultiplyTestCase(-4 ,50 ,-200 ),
                        new MultiplyTestCase(12 ,-4 ,-48 ),
                        new MultiplyTestCase(0 ,25 ,0 ),
                        new MultiplyTestCase(10 ,0 ,0 ),
                        new MultiplyTestCase(0 ,0 ,0 ),
                        new MultiplyTestCase(-500 ,0 ,0 ),
                        new MultiplyTestCase(0 ,-120 ,0 )
                )
        );
        for (MultiplyTestCase testCase : testCases){
            int inOne=testCase.getInputOne();
            int inTwo=testCase.getInputTwo();
            int expected=testCase.getExpectedOutput();
            int actual=SimpleMath.multiplyInt(inOne,inTwo);
            assertEquals("input("+inOne+","+inTwo+")",expected,actual);
        }
    }
}
