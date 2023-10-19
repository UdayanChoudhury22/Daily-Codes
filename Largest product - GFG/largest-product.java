//{ Driver Code Starts
import java.util.*;
import java.lang.Math;


class Largest_Product_Subarray
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t>0)
		{
			
			int n = sc.nextInt();
			int k = sc.nextInt();
			int arr[]  = new int[n];
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();
				
			
			
			GfG g = new GfG();
			System.out.println(g.findMaxProduct(arr, n , k));
		t--;
		}
	}
}
// } Driver Code Ends


/*You are required to complete the function*/
class GfG
{
    static long maximum(int A[],int starting,int ending)
    {
        long sum = 1l;
        for(int i=starting;i<ending;i++)
        {
            sum *= A[i];
        }
        return sum;
    }
    long findMaxProduct(int A[], int n, int k)
    {
	// Your code here
	long max = 0l;
// 	long sum = 1l;
	    for(int i=0;i<=n-k;i++)
	    {
	           long sum = maximum(A,i,i+k);
	           if(max < sum)
	            max = sum;
	    }
	    return max;
    }
}