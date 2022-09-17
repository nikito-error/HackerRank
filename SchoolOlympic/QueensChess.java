class QueensChess
{
 
    static int MAX = 10;
 
    static int arr[] = new int[MAX], no;
 
    // Function to check queens placement
    static void nQueens(int k, int n)
    {
 
        for (int i = 1; i <= n; i++)
        {
            if (canPlace(k, i))
            {
                arr[k] = i;
                if (k == n)
                {
                    display(n);
                }
                else
                {
                    nQueens(k + 1, n);
                }
            }
        }
    }
 
    // Helper Function to check if queen can be placed
    static boolean canPlace(int k, int i)
    {
        for (int j = 1; j <= k-1; j++)
        {
            if (arr[j] == i ||
                (Math.abs(arr[j] - i) == Math.abs(j - k)))
            {
                return false;
            }
        }
        return true;
    }
 
    // Function to display placed queen
    static void display(int n)
    {
     
 
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= n; j++)
            {
                if (arr[i] != j)
                {
                 
                }
                else
                {
                    System.out.print(i+ " " +j);
                }
            }
            System.out.println("");
        }
       
 
      
    }
 
    // Driver Code
    public static void main(String[] args)
    {
        int n = 4;
        nQueens(1, n);
    }
}
 