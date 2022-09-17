package Puzzles;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class AreaOfAParallelogram {
	static boolean flag=true;
    static Scanner sc=new Scanner(System.in);
    static int B=sc.nextInt();
    static int H=sc.nextInt();
    static {
        try{
            if (B <=0 || H<=0)
            {
                throw new Exception();
            }
      }
    catch(Exception e){
      System.out.println(e+": Breadth and height must be positive");
      System.exit(0);
    }
    }
    public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class

