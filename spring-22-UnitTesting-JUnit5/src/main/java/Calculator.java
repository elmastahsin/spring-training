public class Calculator {
    public static String operator = "add";

    public static int add(int a, int b) {
        return a + b;
    }
    public static int add2(int a, int b) {
        if (a>b) {
            throw new IllegalArgumentException("My Exception");
        }
        return a + b;
    }
}
