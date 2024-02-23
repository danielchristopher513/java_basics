package testcases;

import junit.framework.TestCase;

public class calculatorTest extends TestCase {
    Calculator calculator;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        System.out.println("setting up env for testing");
        calculator  = new Calculator();
    }

    @org.junit.Test
    public void add() {
        int expected = 40;
        int actual = Calculator.add(10,20);
        System.out.println("expected ="+expected+"-actual ="+actual);
        assertEquals(expected,actual);
    }

    public void testMultiplication(){
        int expectation = 20;
        int actual = calculator.multiply(5,4);
        System.out.println("expected ="+expectation+"-actual ="+actual);

        assertEquals(expectation,actual);
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
        System.out.println("done with testing  now winding up");
    }
}