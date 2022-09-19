package Puzzles;
import java.io.*;
import java.util.*;
class Checker{
    
    Comparator<Player> desc = new Comparator<Player>(){
    
    public int compare(Player a,Player b){
        if(a.score>b.score)return -1;
        else if(a.score<b.score)return 1;
        else{
            int res=a.name.compareTo(b.name);
            if(res<0)return 1;
            else return -1;
        }
        
    }
    };
}
	class Player
	{
		String name;
		int score;
	}

	public class CompareThePlayers {

		public static void main(String[] args) throws NumberFormatException, IOException {
		  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	       
		  int N=Integer.parseInt(br.readLine().trim());
		  String s;
		  StringTokenizer st;
		  Player Player[]=new Player[N];
		  Checker check=new Checker();
		  for(int i=0;i<N;i++)
		  {
			  s=br.readLine().trim();
			  st=new StringTokenizer(s);
			  Player[i]=new Player();
			  Player[i].name=st.nextToken();
			  Player[i].score=Integer.parseInt(st.nextToken());
		  }
		 
		  Arrays.sort(Player,check.desc);
		  for(int i=0;i<Player.length;i++)
		  {
				System.out.printf("%s %s\n",Player[i].name,Player[i].score);
		  }

			
	    }
	}
