import java.util.ArrayList;
import java.util.Scanner;

public class MaxsumofnumbersinOrder2
	{
	    public static void main (String[] args)
	    {
	    	int j=0;
	    	Scanner scanner=new Scanner(System.in);
	    	ArrayList<Integer> f=new ArrayList<Integer>();
	    	int t=scanner.nextInt();
	    	int max=t;
	    	for(int i=0;i<t;i++) {
	    		int n=scanner.nextInt();
	    		f.add(n);
	    		j++;
	    	}
	    	if(max==j) {

	        System.out.println(maxSubArraySum(f));
	    	}
	    }
	 
	    static int maxSubArraySum(ArrayList<Integer> f)
	    {
	        int size = f.size();
	        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
	 
	        for (int i = 0; i < size; i++)
	        {
	            max_ending_here = max_ending_here + f.get(i);
	            System.out.println(max_ending_here);
	            if (max_so_far < max_ending_here)
	                max_so_far = max_ending_here;
	            if (max_ending_here < 0)
	                max_ending_here = 0;
	        }
	        return max_so_far;
	    }
	}
