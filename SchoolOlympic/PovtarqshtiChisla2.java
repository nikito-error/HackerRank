import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class PovtarqshtiChisla2 {
	public static int countF(int arr[],int n,int arr1[]) {
		int br=0;
		int total=-1;
		int f=100001;
		for(int i2=0;i2<n;i2++) {
			for(int i4=0;i4<arr1.length;i4++) {
			if(arr1[i4]==arr[i2]) {
				br++;
			}else {
				br=0;
			}
			if(br>total) {
				total=br;
			}
			if(br==total) {
				if(f>arr[i4]) {
					f=arr[i4];
				}
			}
			
		 
			}
		}
		return f;
	}
	public static void main(String []args) {
		Scanner scanner=new Scanner(System.in);
		int a=0,i,j,n=0;
		int arr[] = null;
		int t=scanner.nextInt();
		for(i=0;i<t;i++) {
			n=scanner.nextInt();
			if(n>=2 && n<=10000000) {
				arr=new int[n];
					for(int i1=0;i1<n;i1++)
					{
						arr[i1]=scanner.nextInt();
						if(arr[i1]>=1 && arr[i1]<=100000)
						{
							
						}else {
							break;
						}
					}
					Arrays.sort(arr);
			
						System.out.println(countF(arr,n,arr));
						
				}
				}
				
	}}
