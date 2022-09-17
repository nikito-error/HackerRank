import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class beer1 {
public static void main(String [] args) {
	Scanner scanner =new Scanner(System.in);
	ArrayList <Long> arr=new ArrayList<Long>();
	ArrayList <Long> arr1=new ArrayList<Long>();
	ArrayList <Long> arr2=new ArrayList<Long>();
	ArrayList <Long> arr3=new ArrayList<Long>();
	long n,s,li;
	long br=0;
	long total;
	long max =0;
	long min = 9999999;
	long max1 =0;
	long min1 = 9999999;
	long t;
	long total2;
	long c=0;
	boolean p=true;
		n=scanner.nextInt();
		s=scanner.nextInt();
		if(n>=2 && n<=20000){
			if(s>=1 && s<=1000000){
			
		for(int i=0;i<n;i++){
			li=scanner.nextInt();
			if(li>=1 && li <=1000000){
				arr.add(li);
				arr1.add(li);
			}
		}
	}
	}
	for (int j=0;j<arr1.size();j++) {
		min=9999999;
		max=0;
	for(int i=0;i<arr.size();i++){
		if(arr.get(i)<min) {
			min=arr.get(i);
		}
		if(arr.get(i)>max) {
			max=arr.get(i);
		}
	}
	total=max+min;
	if(max!=min) {
	if(total<=s) {
		br++;
		arr2.add(max);
		arr3.add(max);
		arr.remove(new Long(max));
	}else {
		arr.remove(new Long(max));
	}
	}
	}
	br++;
	for(int g=0;g<arr3.size();g++) {
		min1=9999999;
		max1=0;
	for(int q=0;q<arr2.size();q++) {
		if(arr2.get(q)<min1) {
			min1=arr2.get(q);
		}
		if(arr2.get(q)>max1) {
			max1=arr2.get(q);
		}
	}
		if(max1!=min1) {
			total2=max1+min1;
			if(total2<=s) {
				p=true;
				break;
			}else {
				arr2.remove(new Long(max1));
				p=false;
			}
		}
	}
	if(p==false) {
		br--;
	}
	for(int i=0;i<2;i++) {
		t=scanner.nextInt();
	}
	System.out.println(br);
	
	
}
}
