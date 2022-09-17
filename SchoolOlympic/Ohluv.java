import java.util.Scanner;

public class Ohluv {
public static void main(String []args) {
	Scanner scanner=new Scanner(System.in);
	long v,b,a;
	for(long i=0;i<3;i++) {
	long total;
	a=scanner.nextLong();
	b=scanner.nextLong();
	v=scanner.nextLong();
long ant=a-b;
long bent=v-b;
for(long i1=0; i1<3;i1++) {
if(ant==0) {
	System.out.println(-1);
	break;
	
}
if(a<b) {
 total=bent/ant;
 System.out.println(total);
 break;

}
		total=(((bent)-1)/ant+1);
		
		System.out.println((total));	
		break;
	
		}
	}
	}

	}
	// c++ implementation 
/* #include<iostream>
using namespace std;
int main(){
	long v,b,a;
	for(long i=0;i<3;i++) {
	long total;
	cin>>a;
	cin>>b;
	cin>>v;
if(a>b && b>=1 && v>=a && v<=100000000 ){
	total=(((v-b)-1)/(a-b)+1);
		if(total > 0){
				cout<<total<<endl;		
		
		
		}
	
}
		
	}
	return 0;
}
*/
/* #include<iostream>
using namespace std;

long long numDays(long long wall_height, long long meters_per_day,long long meters_down_per_day) {
    long long current_height = 0;
    long long days = 1;

    while (current_height != wall_height) {
        current_height += meters_per_day;
        
        if(current_height >= wall_height)
            break;
        
        days += 1;
        current_height -= meters_down_per_day;
    }

    return days;
}
int main()
{

    long long wall_height ;
    long long meters_per_day ;
   long long meters_down ;
    for(int i=0;i<3;i++){

    cin>>meters_per_day ;
    cin>>meters_down ;
    cin>>wall_height;
   if( meters_per_day>meters_down && meters_down>=1 && wall_height>=meters_per_day && wall_height<=100000000 ){
   

    if (meters_down >= meters_per_day) {
    }else {
        cout << numDays(wall_height, meters_per_day, meters_down) << endl;
    }
}
    
	}
    return 0;
}
*/
/*
#include<iostream>
#include<math.h>
using namespace std;
int main(){
    long double  v,b,a;
    for(long i=0;i<3;i++) {
    long double total;
    cin>>a;
    cin>>b;
    cin>>v;
if(b>=1 && a>b && v>=a && v<=1000000000){
    total=ceil((v-a)/(a-b));
        if(total > 0) {
                cout<<(unsigned long long int)total+1<<endl;        
        
        
        }
    
}
        
    }
    return 0;
}
*/