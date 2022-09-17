import java.util.Scanner;

public class Ediniici {
	public static void main(String []args) {
		Scanner scanner=new Scanner(System.in);
		int t,n;
		long k;
		long total = 0;
		String f = "";
		t=scanner.nextInt();
		for(int i=0;i<t;i++) {
		n=scanner.nextInt();
		if(n>=1 && n<=1000000) {
		for(int p=0;p<n;p++) {
			for(int j=0;j<n;j++) {
				f=f+"1";
			}
		if(p>0) {
			for(int d=0;d<p;d++)
			{
			f=f+"0";
			}
		}
		k=Long.parseLong(f);
		total=total+k;
		f = "";
		}
		System.out.println(total);
		total=0;
			}
		}   
		}
	}