import java.util.Scanner;

public class Ovce {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int t;
		int n;
		int t1;
		int t2;
		int t3;
		int t4;
		t=scanner.nextInt();
		for(int i=0;i<t;i++) {
		n=scanner.nextInt();
		t1=n/3;
		t2=n/2;
		t3=t1*2+t2;
		if(t3%2!=0) {
			t3=t3-1;
			
		}
		t3=t3/2;
		t4=t3+n;
		System.out.println(t4);
		
		}
		
	
	}

}
