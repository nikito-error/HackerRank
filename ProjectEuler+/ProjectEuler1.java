import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ProjectEuler1 {
private static long sumDivisible(long m, long n) {
        long p = m / n;
        return n * (p * (p + 1)) / 2;
    }

    private static long calculate(long m) {
        return sumDivisible(m - 1, 3) + sumDivisible(m - 1, 5) - sumDivisible(m - 1, 15);
    }

       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        for (int i = 0; i < count; i++) {
            long m = sc.nextLong();
            System.out.println(calculate(m));
        }

    }
}
