//{ Driver Code Starts
import java.util.*;

class ArrPathSum1
{
	// Driver Code
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		while(T>0)
		{
			int m = sc.nextInt();
			int n = sc.nextInt();
			int ar1[] = new int[m];
			int ar2[] = new int[n];
			for(int i=0; i<m; i++)
				ar1[i] = sc.nextInt();
			for(int i=0; i<n; i++)
				ar2[i] = sc.nextInt();
		
		Solution g = new Solution();
		System.out.println(g.maxPathSum(ar1,ar2));
		T--;
		}
	}
}
// } Driver Code Ends


class Solution
{
    /*You are required to complete this method
    * ar1 : 1st array
    * ar2 : 2nd array
    */
    int max(int x, int y) { return (x > y)? x : y; }
	
	// function to find max path sum
	int maxPathSum(int ar1[], int ar2[])
	{
		int i = 0, j = 0;
		int result = 0, sum1 = 0, sum2 = 0;
		
		while(i < ar1.length && j<ar2.length)
		{
			if(ar1[i] < ar2[j])
				sum1 += ar1[i++];
				
			else if(ar1[i] > ar2[j])
				sum2 += ar2[j++];
				
			else
			{
				result += max(sum1, sum2);
				
				sum1 = 0; sum2 = 0;
				
				while(i < ar1.length && j < ar2.length && ar1[i] == ar2[j])
				{
					result = result + ar1[i++];
					j++;
				}
			}
		}
		
		while(i < ar1.length)
			sum1 = sum1 + ar1[i++];
			
		while(j < ar2.length)
			sum2 = sum2 + ar2[j++];
			
		result += max(sum1, sum2);
		
		return result;
	}
}