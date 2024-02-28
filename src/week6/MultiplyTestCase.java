package week6;

public class MultiplyTestCase {
    private int inputOne;
    private int inputTwo;
    private int expectedOutput;

    public MultiplyTestCase(int inputOne,int inputTwo,int expectedOutput){
        this.inputOne=inputOne;
        this.inputTwo=inputTwo;
        this.expectedOutput=expectedOutput;
    }

    public int getExpectedOutput() {
        return expectedOutput;
    }

    public int getInputOne() {
        return inputOne;
    }

    public int getInputTwo() {
        return inputTwo;
    }
}
