import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class ProjectEuler6 {
	static Scanner scanner = new Scanner(System.in);
	public void solve() {
		long n=scanner.nextLong();
		long sum=0;
		long ans=0;
		for(int i=1;i<=n;i++) {
			sum+=i;
			ans=(long) (ans+Math.pow(i, 2));
			
		}
		sum=(long) Math.pow(sum, 2);
		ans=sum-ans;
		System.out.println(ans);
	}
	  
	public static void main(String []args)
	{
		ProjectEuler6 pr=new ProjectEuler6();
		long t=scanner.nextLong();
		while(t>0) {
	    pr.solve();
	    t--;
		}
	 
	}

}