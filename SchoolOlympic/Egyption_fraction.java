import java.util.ArrayList;
import java.util.Scanner;

public class Egyption_fraction {
     
    // Function to find number of ordered
    // positive integer pairs (x,y) such
    // that they satisfy the equation
    static void solve(int n)
    {
        int x;
        
        ArrayList<Integer> p=new ArrayList<Integer>();
        ArrayList<Integer> f=new ArrayList<Integer>();
        // Initialize answer variable
        int ans = 0;
     
        // Iterate over all possible values of y
        for(int y = n + 1; y <= n * n + n; y++)
        {
             
            // For valid x and y,
            // (n*n)%(y - n) has to be 0
            if ((n * n) % (y - n) == 0)
            {
                
                
                  ans=ans+1;
                  p.add(y);
                  f.add(y);
                // Increment count of ordered pairs
               
            }
        }
        for(int j=0;j<f.size();j++) {
            int max=0;
            int min=99999;
       for(int i=0;i<p.size();i++) {
           if(p.get(i)>max) {
               max=p.get(i);
           }
           if(p.get(i)<min) {
               min=p.get(i);
           }
       }
       if(max==min) {
           break;
       }else {
           System.out.print(min+" ");
           p.remove(new Integer(min));
           System.out.print(max);
           p.remove(new Integer(max));
       }
       System.out.println();
        }
        // Print the answer
     
    }
     
    // Driver Code
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        for(int i=0;i<t;i++) {
        int n =scanner.nextInt();
         
        // Function call
        solve(n);
        }
    }
    }