package Puzzles;
import java.io.*;
import java.lang.reflect.*;
import java.util.*;
import java.util.regex.*;
public class PrivateAccess {

		public static void main(String[] args) throws Exception {
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			int num=Integer.parseInt(br.readLine().trim());
			Object o;
			o = (new PrivateAccess()).new Private();
	        System.out.print(num + " is " +((PrivateAccess.Private)o).powerof2(num)+"\n");
		System.out.println("An instance of class: "+o.getClass().getSimpleName()+" has been created");
		}//end of main
	  	class Private
	 	{
	       private String powerof2(int num)
	 	   {
	           return ((num&num-1)==0)?"power of 2":"not a power of 2";
	       }
	  	}//end of Privtate
}
