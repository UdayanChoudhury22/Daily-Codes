//{ Driver Code Starts
//Initial Template for Java


/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
	    
	    //taking input using Scanner class
		Scanner sc=new Scanner(System.in);
		
		//taking total count of testcases
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    //taking total number of elements
		    int n=sc.nextInt();
		    
		    //calling printFibb() method
		    long[] res = new Solution().printFibb(n);
		    
		    //printing the elements of the array
		    for (int i = 0; i < res.length; i++)
		        System.out.print (res[i]+" ");
		    System.out.println();
		}
	}
}
// } Driver Code Ends


//User function Template for Java


class Solution
{
    //Function to return list containing first n fibonacci numbers.
    public static long[] printFibb(int n) 
    {
        //Your code hereLo
        long arr[] = new long[n];
        if(n==1)
        {
            arr[0] = 1;
            return arr;
        }
        if(n==2)
        {
            arr[0] = 1;
            arr[1] = 1;
            return arr;
        }
        
        long first = 1;
        arr[0] = first;
        long second = 1;
        arr[1] = second;
        int k=2;
        while(n-2!=0)
        {
           long newTerm = first+second;
           arr[k] = newTerm;
           first = second;
           second = newTerm;
           k++;
           n--;
        }
        return arr;
        
    }
}