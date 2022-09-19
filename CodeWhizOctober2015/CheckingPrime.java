package Puzzles;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;
import static java.lang.System.*;
class Prime {
	static void checkPrime(int... n) {

	    List<Integer> list = new ArrayList<Integer>();
	    for (int a : n) {
	        int v = isPirme(a);
	        if (v > 0) {
	            list.add(v);
	        }
	    }

	    StringBuilder strbul=new StringBuilder();
	        for(Integer str : list)
	        {
	            strbul.append(str);
	             strbul.append(" ");
	        }
	    System.out.println(strbul.toString());

	}

	static int isPirme(int num) {
	    int i = 2;
	    boolean flag = false;
	    while (i <= num / 2) {
	        // condition for nonprime number
	        if (num % i == 0) {
	            flag = true;
	            break;
	        }

	        ++i;
	    }

	    if (!flag) {
	        return num;
	    } else {
	        return 0;
	    }
	}
}
public class CheckingPrime {

	   public static void main(String[] args) {
	      try{
	      BufferedReader br=new BufferedReader(new InputStreamReader(in));
	      Random rand=new Random();
	      int n=rand.nextInt();
	      Prime ob=new Prime();
	     
	      Prime.checkPrime(9,10,32,89,66);
	      Prime.checkPrime(19,78,98,100,787,8989,12817,11,192);
	      Prime.checkPrime(90,2,31,890,8278,87892,12,10);
	      Method[] methods=Prime.class.getDeclaredMethods();
	      Set<String> set=new HashSet<>();
	      boolean overload=false;
	      for(int i=0;i<methods.length;i++)
	      {
	         if(set.contains(methods[i].getName()))
	         {
	            overload=true;
	            break;
	         }
	         set.add(methods[i].getName());
	         
	      }
	      if(overload)
	      {
	         throw new Exception("Overloading not allowed");
	      }
	      }
	      catch(Exception e)
	      {
	         System.out.println(e);
	      }
	   }
	   
	}


