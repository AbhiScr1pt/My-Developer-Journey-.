
package day2;
import java.util.*;

public class age {
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();

        if (age > 17) {
            System.out.println("adult");
        } else {
            System.out.println("not adult");
        }
    }
}
