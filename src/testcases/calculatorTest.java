package testcases;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class calculatorTest {

    @Test
    void testAdd() {
        int exp=30;
        int act=calculator.add(10,20);
        assertEquals(exp,act);
    }
}