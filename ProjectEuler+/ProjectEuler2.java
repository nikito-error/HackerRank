import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ProjectEuler2 {
	static Scanner scanner =new Scanner(System.in);
	
	public void solve() {
		     long last=scanner.nextLong();

		    long  sum = 0;
		    // first Fibonacci numbers
		    long a = 1;
		    long b = 2;

		    while (b <= last)
		    {
		      // even ?
		      if (b % 2 == 0)
		        sum += b;

		      long next = a + b;
		      a = b;
		      b = next;
		    }

		    System.out.println(sum);
		
	}
	public static void main(String[] args) {
	ProjectEuler2 pr=new ProjectEuler2();
	long t=scanner.nextLong();
	while(t>0) {
    pr.solve();
    t--;
	}
	}
  
}
