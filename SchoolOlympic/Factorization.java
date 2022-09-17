import java.io.*;
import java.lang.Math;
import java.util.*;
class Factorization{
 
    // A function to print all prime factors
    // of a given number n
    public static void primeFactors(int n,
                                    HashSet<Integer> h)
    {
        // Print the number of 2s that divide n
        while (n % 2 == 0) {
 
            h.add(2);
            n /= 2;
        }
 
        // n must be odd at this point. So we can
        // skip one element (Note i = i +2)
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
 
            // While i divides n, print i and divide n
            while (n % i == 0) {
                h.add(i);
                n /= i;
            }
        }
 
        // This condition is to handle the case when
        // n is a prime number greater than 2
        if (n > 2)
            h.add(n);
    }
    static void printFactors(HashSet<Integer> H)
    {
        // Iterator over the HashSet
        Iterator<Integer> It = H.iterator();
 
        // printing the elements of HashSet
        while (It.hasNext()) {
 
            System.out.print(It.next() + " ");
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        int n = 72;
        HashSet<Integer> h = new HashSet<>();
 
        primeFactors(n, h);
 
        // print the unique factors
        printFactors(h);
    }
}
