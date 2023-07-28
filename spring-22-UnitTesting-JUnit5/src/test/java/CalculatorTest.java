import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        System.out.println("Add Method");
        int actual = Calculator.add(2, 3);
        assertEquals(5, actual,"Test Failed");
    }
    @Test
    void testCase1() {
        System.out.println("Test Case 1");
        assertEquals("add", Calculator.operator);
        assertTrue(Calculator.operator.equals("add"));



    }
}