//{ Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t > 0){
        	int n = sc.nextInt();
        	int[] array = new int[n];
        	for(int i=0; i<n; i++)
        	{
        		array[i] = sc.nextInt();
        	}
        	int target = sc.nextInt();

            Solution ob = new Solution();
			System.out.println(ob.Search(array,target));
            t--;
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java

class Solution 
{ 
    static int binarySearch(int arr[],int low,int high,int target)
    {
        while(low<=high)
        {
            int mid = low+(high-low)/2;
            if(arr[mid] == target)
                return mid;
            else if(arr[mid] < target)
                low = mid+1;
            else
                high = mid-1;
        }
        return -1;
    }
    static int Search(int arr[], int target)
	{
	    // code here
	    int low = 0;
	    int high = arr.length-1;
	    while(low<high)
	    {
	        int mid = low+(high-low)/2;
	        if(arr[mid] > arr[high])
	            low = mid+1;
	        else
	            high = mid;
	    }
	    
	    int res1 = binarySearch(arr,0,low-1,target);
	    int res2 = binarySearch(arr,low,arr.length-1,target);
	    
	    if(res1!=-1)
	        return res1;
	    if(res2 != -1)
	        return res2;
	    return -1;
	}
} 

