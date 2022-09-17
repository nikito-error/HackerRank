import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class beer2 {
public static void main(String []args) {
	Scanner scanner = new Scanner(System.in);
	int s=6;
	int li;
	int n=4;
	int j=1;
	int br=0;
	ArrayList<Integer> prices=new ArrayList<Integer>();
	for(int i=0;i<n;i++) {
		li=scanner.nextInt();
		prices.add(li);
	}
	Collections.sort(prices);
	for(int i=0;i<prices.size();i++) {
		int imax=prices.get(prices.size()-j);
		if(imax+prices.get(0)>s) {
			j++;
		}else {
			br++;
		}
	}
			
	}
}
