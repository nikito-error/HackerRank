import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class ProjectEuler5 {
	public long gcd(long a, long b)
	{
	   if(a%b != 0)
	      return gcd(b,a%b);
	   else
	      return b;
	}

	public long lcm(long n)
	{
	    long ans = 1;   
	    for (long i = 1; i <= n; i++)
	        ans = (ans * i)/(gcd(ans, i));
	    return ans;
	}
	  
	public static void main(String []args)
	{
		Scanner scanner = new Scanner(System.in);
		ProjectEuler5 pr=new ProjectEuler5();
		long t=scanner.nextLong();
		while(t>0) {
	    long n=scanner.nextLong();
	    System.out.println(pr.lcm(n));
	    t--;
		}
	 
	}

}
