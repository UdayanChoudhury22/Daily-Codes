//{ Driver Code Starts
import java.util.*;

class Maxsum_Among_All_Rotations_Array
{
	public  static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int n = sc.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();
			
			System.out.println(new GfG().max_sum(arr,n));
			
		t--;
		}
	}
	
}

// } Driver Code Ends


class GfG
{
    int max_sum(int arr[], int n)
    {
	// Your code here
	    int sum0 = 0;
	    int sum = 0;
	    for(int i=0;i<n;i++)
	    {
	        sum += arr[i];
	        sum0 += arr[i]*i;
	    }
	    
	    int max = sum0;
	    int sumi = sum0;
	    
	    for(int i=0;i<n;i++)
	    {
	        int temp = sumi + sum - n*arr[n-i-1];
	        
	        if(temp > max)
	            max = temp;
	            
	       sumi = temp;
	    }
	    return max;
    }	
}
