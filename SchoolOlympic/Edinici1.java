import java.math.BigInteger;
import java.util.Scanner;

public class Edinici1 {
	public static void main(String []args) {
		Scanner scanner=new Scanner(System.in);
		int t,n;
		int k=1;
		long total = 0;
		String f = "";
		t=scanner.nextInt();
		for(int i=0;i<t;i++) {
		n=scanner.nextInt();
		if(n>=1 && n<=1000000) {
			if(n<=10) {
			for(int r=1;r<n+1;r++) {
				System.out.print(r);
			}
			for(int d=n;d>1;d--) {
				System.out.print(d-1);
			}
			System.out.println("");
				}
		} if(n>10){
			
		for(int j=0;j<n;j++) {
			f=f+"1";
		}
		BigInteger bd = new BigInteger(f);
		System.out.println(bd.multiply(new BigInteger(f)));
		} 
		}
		}
}