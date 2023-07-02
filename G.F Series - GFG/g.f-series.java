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
            int N=sc.nextInt();
			
            Solution ob = new Solution();
            ob.gfSeries(N);
            
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution{
    static void gfSeries(int N){
        // code here
    System.out.print(0+" "+1+" ");
     printRecurrsively(0, 1, N-2);
     System.out.println("");
    
    }
    
    static void printRecurrsively(long firstVal, long secondVal, int N){
        
        if(N==0){
            return;
        }
        long k = firstVal*firstVal-secondVal;
        firstVal=secondVal;
        secondVal=k;
        System.out.print(k+" ");
       printRecurrsively(firstVal,secondVal,N-1);
        
    }
    
    
}