import java.util.Scanner;
//fastest way to make Prime numbers xD 0_0
public class PrimeNumbers{    
 public static void main(String args[]){    
	 Scanner scanner = new Scanner(System.in);
	  // Number of iterations
	   long 	 n;
	 long t;
	 t=scanner.nextLong();
	 for(long i=0;i<t;i++){
	 
	    n=scanner.nextLong();
	   
	       if (isPrime(n))
	       {
		   
	          System.out.println("YES");
	       }else {
			  
	          
	          System.out.println("NO");
	      
			  }
	      }
 }
 public static boolean isPrime(long  number) {
	    
	    if (number < 2)
	        return false;
	    
	    if (number == 2)
	        return true;    
	    
	    if(number % 2 == 0)
	        return false;
	    
	     long  sqrt = ( long  ) Math.sqrt(number);
	    
	    for ( long i = 3; i <= sqrt; i+=2) {
	        if (number % i == 0)
	            return false;
	    }
	    
	    return true;
	} 

}   
// A <>