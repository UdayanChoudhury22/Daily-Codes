//{ Driver Code Starts
import java.io.*;

import java.util.*;

class Main {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    //size of array
		    int n = Integer.parseInt(br.readLine().trim());
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    
		    //adding elements
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]);
		    }
		    
		    Solution obj = new Solution();
		    
		    //calling maxSubarraySum() function
		    System.out.println(obj.maxSubarraySum(arr, n));
		}
	}
}


// } Driver Code Ends

class Solution
{
    long maxSubarraySum(int arr[], int n){
        
        // Your code here
        long res = arr[0];
        long local = 0l;
        for(int i=0;i<n;i++)
        {
            local += arr[i];
            
            if(local > res)
                res = local;
            
            if(local < 0)
                local = 0;
        }
        if (res == 0)
            res = -1l;
        return res;
    }
    
}


// class Solution{
//     long maxSubarraySum(int arr[], int n){
        
//         // Your code here
//         long max_curr = 0;
//         long max_total = arr[0];
//         for(int i=0;i<n;i++)
//         {
//             max_curr += arr[i];
//             if(max_total < max_curr)
//                 max_total = max_curr;
            
//             if(max_curr < 0)
//                 max_curr = 0;
//         }
//         return max_total;
        
//     }
    
// }
