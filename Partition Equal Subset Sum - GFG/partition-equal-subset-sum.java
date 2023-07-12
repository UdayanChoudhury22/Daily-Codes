//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            String input_line[] = in.readLine().trim().split("\\s+");
            int arr[] = new int[N];
            for(int i = 0;i < N;i++)
                arr[i] = Integer.parseInt(input_line[i]);
            
            Solution ob = new Solution();
            int x = ob.equalPartition(N, arr);
            if(x == 1)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution{
    static int equalPartition(int N, int arr[])
    {
       
        int sum1=0;
        int sum2=0;
        for(int i:arr)
            sum2+=i;
        if(sum2%2==1)
            return 0;
        boolean res=false;
        res=result(0,res,arr.length,sum1,sum2,arr);
        if(res==true)
            return 1;
        return 0;
    }
    public static boolean result(int count,boolean res,int n,int sum1,int sum2,int arr[])
        {
            if(count==n && sum1==(sum2))
                {
                    return true;
                }
            if(count==n && sum1!=sum2)
                return false;
            if(sum1>sum2)
                {
                    return false;
                }
            
            
            sum1+=arr[count];
           boolean res1=result(count+1,res,n,sum1,sum2-arr[count],arr);
           if(res1==true)
                return true;
            
            
            
            sum1-=arr[count];
            boolean res2=result(count+1,res,n,sum1,sum2,arr);
            
            return res1 || res2;
            
        }
}