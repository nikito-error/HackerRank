
import java.lang.*;
import java.util.Scanner;
public class EGN {
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		int t,n;
		int br=0;
		String f;
		t=scanner.nextInt();
		if(t>=1 && t<=20) {
		for(int i=0;i<t;i++) {
			n=scanner.nextInt();
			if(n>=1 && n<=100) {
				for(int j=0;j<n;j++) {
					f=scanner.next();
					String lastTwoDigits=f.substring(f.length()-2);
					int number=Integer.parseInt(lastTwoDigits);
					if(number%2==0) {
						br++;
					}
					
				}
			}
			System.out.println(br);
		}
		}

}
}
