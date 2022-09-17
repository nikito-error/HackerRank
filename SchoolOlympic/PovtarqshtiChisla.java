import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PovtarqshtiChisla {
public static void main(String []args) {
	Scanner scanner=new Scanner(System.in);
	int a,n,i,j,total,br,f,all;
	ArrayList<Integer>numbers=new ArrayList<Integer>();
	int t=scanner.nextInt();
	for(i=0;i<t;i++) {
		total=0;
		br=0;
		f=0;
		all=100001;
		n=scanner.nextInt();
		if(n>=2 && n<=10000000) {
			for(j=0;j<n;j++) {
			a=scanner.nextInt();
			if(a>=1 && a<=100000)
			{
			numbers.add(a);
			}
			}
			Collections.sort(numbers);
			br=Collections.frequency(numbers,(numbers.get(0)));
			for(int p=0;p<numbers.size();p++) {
				f++;
				total=Collections.frequency(numbers,(numbers.get(p)));
				if(br<total)
					br=total;
				if(all>numbers.get(p)) {
				all=numbers.get(p);
				}
				}
			if(f==numbers.size()) {
					System.out.println(all);
			}
			}
			
		}
	}
}
