
import java.math.BigInteger;
import java.util.Scanner;
 
public class factor {
     
    // Returns Factorial of N
    static BigInteger factorial(int N)
    {
        // Initialize result
        BigInteger f
            = new BigInteger("1"); // Or BigInteger.ONE
 
        // Multiply f with 2, 3, ...N
        for (int i = 2; i <= N; i++)
            f = f.multiply(BigInteger.valueOf(i));
 
        return f;
    }
 
    // Driver method
    public static void main(String args[]) throws Exception
    {
int t;
Scanner scanner = new Scanner(System.in);
t=scanner.nextInt();
for(int i=0;i<t;i++) {
	int N;
	N=scanner.nextInt();
	if(N<6)
	{
			BigInteger n = factorial(N);
			if (n.equals(BigInteger.ZERO)) {
				return;
			}
			if (n.mod(BigInteger.valueOf(9)).equals(BigInteger.ZERO)) {
				System.out.println(9);
			} else {
				System.out.println(n.mod(BigInteger.valueOf(9)));
			}
		}else {
			System.out.println(9);
		}
}
    }
    }