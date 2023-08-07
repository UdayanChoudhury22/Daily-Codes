//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n = sc.nextInt();
                    int arr[] = new int[n];
                    for(int i = 0;i<n;i++)
                        arr[i] = sc.nextInt();
                    Solution ob = new Solution();
                    if(ob.distinctAdjacentElement(arr,n))
                        System.out.println("YES");
                    else
                        System.out.println("NO");
                }
        }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public boolean distinctAdjacentElement(int arr[] , int n)
    {
        //code here.
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            if(map.containsKey(arr[i]))
                map.put(arr[i],map.get(arr[i])+1);
            else
                map.put(arr[i],1);
        }
        int max = Integer.MIN_VALUE;
        for(Map.Entry<Integer,Integer> val : map.entrySet())
        {
            if(val.getValue() > max)
                max = val.getValue();
        }
        if(max <= (n+1)/2)
            return true;
        return false;
        
    }
}