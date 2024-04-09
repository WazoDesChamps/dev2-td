package ZExemples;

public class Casting_test {
    public static void main(String[] args) {
        int int_a = 5;
        double double_a = int_a;
        System.out.println(double_a);
        double double_b = 5;
        int int_b = (int) double_b;
        System.out.println(double_b);
    }
}
