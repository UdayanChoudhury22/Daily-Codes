//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function Template for Java

class Solution{
    
    static void reverse(int arr[])
    {
        int n = arr.length;
        for(int i=0;i<n/2;i++)
        {
            int temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp;
        }
        
    }
    
    static String removeZero(String str)
    {
 
        // Count leading zeros
 
        // Initially setting loop counter to 0
        int i = 0;
        while (i < str.length() && str.charAt(i) == '0')
            i++;
 
        // Converting string into StringBuffer object
        // as strings are immutable
        StringBuffer sb = new StringBuffer(str);
 
        // The StringBuffer replace function removes
        // i characters from given index (0 here)
        sb.replace(0, i, "");
 
        // Returning string after removing zeros
        return sb.toString();
    }
  
    String calc_Sum(int a[], int x, int b[], int y)
    {
        // Complete the function
        StringBuilder sb = new StringBuilder();
        reverse(a);
        reverse(b);
        int rem = 0;
        int i=0;
        int m = x;
        int n = y;
        while(n > 0 && m > 0)
        {
            int sum = a[i] + b[i] + rem;
            rem = sum/10;
            int val = sum%10;
            sb.append(val);
            i++;
            m--;
            n--;
        }
        while(m>0)
        {
            int sum = a[i] + rem;
            rem = sum/10;
            int val = sum%10;
            sb.append(val);
            i++;
            m--;
        }
        while(n>0)
        {
            int sum = b[i] + rem;
            rem = sum/10;
            int val = sum%10;
            sb.append(val);
            i++;
            n--;
        }
        if(rem !=0)
            sb.append(rem);
        return removeZero(sb.reverse().toString());
    }
  
    
}


//{ Driver Code Starts.

// Driver class
class GFG {
    
    // Driver code
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		// looping through all testcases
		while(testcases-- > 0){
		    
		    String line1 = br.readLine();
		    String[] element = line1.trim().split("\\s+");
		    int sizeOfArray_N = Integer.parseInt(element[0]);
		    
		    int arr [] = new int[sizeOfArray_N];
		    
		    String line = br.readLine();
		    String[] elements = line.trim().split("\\s+");
		    
		    for(int i = 0;i<sizeOfArray_N;i++){
		        arr[i] = Integer.parseInt(elements[i]);
		    }
		    
		    String line2 = br.readLine();
		    String[] ele = line2.trim().split("\\s+");
		    int sizeOfArray_M = Integer.parseInt(ele[0]);
		    
		    int brr [] = new int[sizeOfArray_M];
		    
		    line2 = br.readLine();
		    String[] elements2 = line2.trim().split("\\s+");
		    
		    for(int i = 0;i<sizeOfArray_M;i++){
		        brr[i] = Integer.parseInt(elements2[i]);
		    }
		    
		    Solution obj = new Solution();
		   
		    String res = obj.calc_Sum(arr, sizeOfArray_N, brr, sizeOfArray_M);
		    
		    System.out.println(res);
		    
		    
		}
	}
}


            


// } Driver Code Ends