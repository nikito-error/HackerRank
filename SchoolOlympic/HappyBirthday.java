
import java.util.*;
class HappyBirthday {
	  public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);
		  int t = scanner.nextInt();
		  for(int j =0 ;j<t; j++) {
		  double a=scanner.nextDouble();
		  double b=scanner.nextDouble();
		  double c=0;
		  String s =scanner.next();
		  double d = Double.parseDouble(s);
		  c= (double) d;

	    double[] array = {a,b,c};
	    
	    //initialize LCM and GCD with the first element
	    double lcm = array[0];
	    double gcd = array[0];
	 
	    //loop through the array to find GCD
	    //use GCD to find the LCM
	    for(int i=1; i<array.length; i++){
	      gcd = findGCD(array[i], lcm);
	      lcm = (lcm*array[i])/gcd;
	    }
	    
	    //output the LCM
	    System.out.println("LCM: "+lcm);
		  }
	  }
	 
	  //recursive function to find GCD of two numbers
	  public static double findGCD(double a, double b){
	    //base condition
	    if(b == 0)
	      return a;
	    
	    return findGCD(b, a%b);
	  }
	}
/*
 S=sqrt(1/3+1/4+1/2.4) 

 */
