import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        System.out.println("Add Method");
        int actual = Calculator.add(2, 3);
        assertEquals(5, actual, "Test Failed");
    }

    @Test
    void testCase1() {
        System.out.println("Test Case 1");
        assertEquals("add", Calculator.operator);
        assertTrue(Calculator.operator.equals("add"));
    }

    @Test
    void testCase2() {
        System.out.println("Test Case 2");
        assertArrayEquals(new int[]{1, 2, 3}, new int[]{1, 2, 3}, "Array Equal Test Failed");
    }

    @Test
    void testCase3() {
        System.out.println("Test Case 3");
        String nullString = null;
        String notNullString = "Company";
        assertNotNull(notNullString);
        assertNull(nullString);
    }

    @Test
    void testCase4() {
        System.out.println("Test Case 4");
        Calculator c1 = new Calculator();
        Calculator c2 = c1;
        Calculator c3 = new Calculator();
        assertSame(c1, c2);
        assertNotSame(c1, c3);

    }
}