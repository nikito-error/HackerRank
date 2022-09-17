import java.util.ArrayList;
import java.util.Scanner;

public class maxSumofnumbersInOrder {
	 
	public static void main(String[] args)
	{
		int sum=0;
		int max=0;
		int pos=0;
		int k=0;
		ArrayList<Integer> f=new ArrayList<Integer>();
		Scanner scanner=new Scanner(System.in);
		int t=scanner.nextInt();
		for(int i=0;i<t;i++) {
	    int n =scanner.nextInt();
	    f.add(n);
		}
		
	    
		for(int i=0;i<f.size();i++) {
			sum=0;
			for(int j=k;j<f.size();j++) {
				sum=sum+f.get(j);
				if(sum>max) {
					max=sum;
					pos=sum;
				}
			}
			k++;
		}
		System.out.println(max);
	}
	}
	