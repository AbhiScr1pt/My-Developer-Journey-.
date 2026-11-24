import java.util.*;

public class simplecalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long sum = a + b;
        long mul = a * b;
        long sub = a - b;

        System.out.println(a + " + " + b + " = " + sum);
        System.out.println(a + " * " + b + " = " + mul);
        System.out.println(a + " - " + b + " = " + sub);
    }

}
