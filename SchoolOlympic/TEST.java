

/*
	ArrayList<Integer> a = new ArrayList<Integer>();
	ArrayList<Integer> b= new ArrayList<Integer>();
	ArrayList<Integer> c= new ArrayList<Integer>();
	a.add(1);
	a.add(2);
	a.add(3);
	a.add(4);
	a.add(4);
	for(Integer element: a) {
		if(!b.contains(element)) {
			b.add(element);
		}
	}
System.out.print(b);
System.out.print(a);
*/
/*for(int i=1;i<=5;i++) {
	for(int j=1;j<=i;j++) {
		System.out.print("* ");
		
	}
	System.out.println();
}*/

import java.util.Scanner;
public class TEST { 
	public TEST(){
		
	}
	public static void main(String [] args) {
	Float a=new Float(10300.0f);
	Float b =new Float(0.0f);
	for(int i=0;i<1000;i++) {
		b+=10.3f;
	}
	if(a.equals(b)==true) {
	System.out.println("Yes");	
	}else {
		System.out.println("No \n"+b);
		
	}
	}
}