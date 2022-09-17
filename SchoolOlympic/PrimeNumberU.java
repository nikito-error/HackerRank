import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class PrimeNumberU {
	private static final Scanner scanner=new Scanner(System.in);
public static void main(String []args) {
	 long t;
	 t=scanner.nextLong();
	 for(long i=0;i<t;i++){
	 
		 BigInteger n=new BigInteger(scanner.next());
			System.out.println(n.isProbablePrime(10)?"YES":"NO");
	      }
	
	
}
}
