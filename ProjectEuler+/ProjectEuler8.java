import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class ProjectEuler8 {
	static Scanner scanner=new Scanner(System.in);
public static void main(String[]args) {
	int t=scanner.nextInt();
	while(t>0) {
		int max=0;
		int sum=1;
		int n=scanner.nextInt();
		int k=scanner.nextInt();
		String f ="";
		f=scanner.next();
		for(int j=0;j<n;j++)
		{
			if(j>0) {
			sum=1;
			f=f.substring(1);
			if(f.length()<k) {
				break;
			}
			}
		for(int i=0;i<f.length();i++) {
			int d=Integer.parseInt(String.valueOf(f.charAt(i)));  
			sum=sum*d;
			if(i==k-1) {
				if(sum>max) {
					max=sum;
				}
				break;
			}
		}
		}
		System.out.println(max);
		t--;
	}
}
}
