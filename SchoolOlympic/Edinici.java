import java.util.Scanner;

public class Edinici {
	public static void main(String []args) {
		Scanner scanner=new Scanner(System.in);
		int t,n;
		t=scanner.nextInt();
		for(int i=0;i<t;i++) {
		n=scanner.nextInt();
		if(n>=1 && n<=1000000) {
		for(int j=1;j<n+1;j++) {
			System.out.print(j);
		}
		for(int k=n;k>1;k--) {
			System.out.print(k-1);
		}
		System.out.println("");
			}
		}
		}
}