public class Overloading {
    public String getSum(String a, String b) {
        return a + b;
    }

    public String getSum(int a, int b) {
        return String.valueOf(a + b);
    }
}
