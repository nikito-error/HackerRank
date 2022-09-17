import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
//vqrnoto

public class PovtarqshtiChisla1 {
	public static void countF(ArrayList<Integer> numbers) {
		int all=1000001,total=0;
	Map<Integer,Integer> hm = new TreeMap<Integer,Integer>();
	for(Integer i: numbers) {
		Integer j=hm.get(i);
		hm.put(i, (j==null)?1 :j+1);
	}
	for(Map.Entry<Integer,Integer> val : hm.entrySet()) {
		if(total<val.getValue()) {
			total=val.getValue();
			all=val.getKey();
		
			}
			}
	System.out.println(all);
	hm.clear();
	}
	
public static void main(String []args) {
	Scanner scanner=new Scanner(System.in);
	int a,n,i,j;
	ArrayList<Integer>numbers=new ArrayList<Integer>();
	int t=scanner.nextInt();
	for(i=0;i<t;i++) {
		n=scanner.nextInt();
		if(n>=2 && n<=9999999) {
			for(j=0;j<n;j++) {
			a=scanner.nextInt();
			if(a>=1 && a<100000)
			{
			numbers.add(a);
			}
			}
			Collections.sort(numbers);
			countF(numbers);
			numbers.clear();
			
		}
	}
	}
}

