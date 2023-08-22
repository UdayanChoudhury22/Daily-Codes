//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            
            
            int l=sc.nextInt();
			int r=sc.nextInt();
			Solution ob = new Solution();
			ArrayList<Integer> numbers = ob.uniqueNumbers(l,r);
			for(int num : numbers){
			    System.out.print(num+" ");
			}
			System.out.println();

        }
    }
}

// } Driver Code Ends


class Solution{
    static boolean isUnique(int num)
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        while(num>0)
        {
            int rem = num%10;
            if(map.containsKey(rem))
                return false;
            else
                map.put(rem,1);
            num/=10;
        }
        return true;
    }

    static ArrayList<Integer> uniqueNumbers(int L,int R){
        // code here
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=L;i<=R;i++)
        {
            if(isUnique(i))
                al.add(i);
        }
        return al;
    }
}