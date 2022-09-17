import java.math.BigInteger;
import java.util.Scanner;

public class DigitalRoot_FactorialRoot {

    public static void main(String args[]) {
    	BigInteger fac=new BigInteger("1");
    	int n;
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter a number:");
    	n=sc.nextInt();
    	for(int i=2;i<=n;++i){
    	fac=fac.multiply(BigInteger.valueOf(i));
    	}
    	System.out.println(fac);

    }

	public static long computeDigitalRoot(long n) {
	    if (n == 0) {
	        return 0;
	    }
	    if (n % 9 == 0) {
	        return 9;
	    }
	    return n % 9;
	}


	}
