import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
 
public class Bessie_essie
{
private static void sort(String[] strArr, String str)
{
    Comparator<String> myComp = new Comparator<String>()
    {
        @Override
        public int compare(String a, String b)
        {
            for(int i = 0;
                    i < Math.min(a.length(),
                                 b.length()); i++)
            {
                if (str.indexOf(a.charAt(i)) ==
                    str.indexOf(b.charAt(i)))
                {
                    continue;
                }
                else if(str.indexOf(a.charAt(i)) >
                        str.indexOf(b.charAt(i)))
                {
                    return 1;
                }
                else
                {
                    return -1;
                }
            }
            return 0;
        }
    };
    Arrays.sort(strArr, myComp);
}
 
// Driver Code
public static void main(String[] args)
{
	 Scanner scanner = new Scanner(System.in);
	 Map<String, Integer> map = new HashMap<String, Integer>();
	String n;
	int f;
	n=scanner.nextLine();
	f=Integer.parseInt(n);
	if(f>=1 && f<=1000) {
	for(int i=0;i<f;i++)
	{
	
	
    String str = "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz";
    String k = "";
 
   
    String[] input = new String[2];  
	String a, b,c;   
	input = scanner.nextLine().split(" "); 
	a= input[0]; 
	b= input[1]; 
	c= input[2];
	if(a.length()>=1 && a.length()<=10 || b.length()>=1 && b.length()<=10 || c.length()>=1 && c.length()<=10) {
    String[] strArr = {a,b,c};
     
    sort(strArr, str);
 
    for(int i1 = 0; i1 < strArr.length; i1++)
    {
        k=k+strArr[i1];
    }
    if(map.containsKey(k)){
        int count = map.get(k);
        map.put(k, count + 1);
    }else{
        map.put(k, 1);
    }
	}else {
		return;
	}
}
	}else {
		return;
	}

	int p;
	p=scanner.nextInt();
	List<Integer> c = new ArrayList<Integer>(map.values());
    Collections.sort(c);
    System.out.println(c.get(c.size()-1));
}

}

    	/*Scanner scanner=new Scanner(System.in);
        //BufferedReader bf = new BufferedReader(new FileReader("records.in"));
        //PrintWriter pw = new PrintWriter(new File("records.out"));
        int n = scanner.nextInt();
        Map<String, Integer> map = new HashMap<String, Integer>();

        for(int i = 0; i<n+1 ;i++){
            String str = scanner.nextLine();
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);

            if(map.containsKey(sorted)){
                int count = map.get(sorted);
                map.put(sorted, count + 1);
            }else{
                map.put(sorted, 1);
            }
        }

        for (String name : map.keySet()) {
            System.out.println(name + ": " + map.get(name));
        }

        List<Integer> c = new ArrayList<Integer>(map.values());
        Collections.sort(c);
        System.out.println(c.get(c.size()-1));
    }
    */