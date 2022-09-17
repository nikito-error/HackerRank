import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class RimskiC {
	
	public static void main(String []args){
		Scanner scanner=new Scanner(System.in);
		int n=100;
		int p=3;
	for(int t=0;t<p;t++) {
		String f=scanner.nextLine();
	String ones[]={"","I","II","III","IV","V","VI","VII","VIII","IX"};
	String tens[]={"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
	Map<String,Integer> all=new TreeMap<String,Integer>();
	int h,h1;String total,newf="",newf1="";
		for(int i=0;i<n;i++){
			h=i;
			h1=i;
			h=h/10;
			h1=h1%10;
			for(int j=0;j<10;j++) {
				if(h==j) {
					newf=tens[j];
				}
				if(h1==j) {
					newf1=ones[j];
				}
			}
			total=newf+newf1;
			all.put(total,i);
	}
		for(Map.Entry<String,Integer> val : all.entrySet()) {
			System.out.println(val.getKey() + ":" +val.getValue());
				
				
		}
		
	}
	
}
}
