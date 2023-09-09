//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int[] arr = new int[n];
            
            for (int i = 0; i < n; ++i)
                arr[i] = sc.nextInt ();

    		ArrayList <Integer> res = new Solution().acceptedProposals (arr, n);
    		System.out.println (res.get (0) + " " +res.get (1));
        }
        
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    ArrayList <Integer> acceptedProposals (int arr[], int n)
    {
        // your code here
        ArrayList<Integer> al = new ArrayList<>();
        Arrays.sort(arr);
        if(n==2)
        {
            al.add(arr[0]);
            al.add(arr[1]);
        }
        else
        {
            al.add(arr[n-2]);
            al.add(arr[1]);
        }
        return al;
    }
}