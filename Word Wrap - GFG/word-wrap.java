//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int[] nums = new int[n];
            String[] S = br.readLine().trim().split(" ");
            for(int i = 0; i < n; i++)
                nums[i]  =Integer.parseInt(S[i]);
            int k = Integer.parseInt(br.readLine().trim());
            Solution obj = new Solution();
            System.out.println(obj.solveWordWrap(nums, k));
        }
    }
}

// } Driver Code Ends



class Solution
{
    public int getMinCost(int nums[], int n, int ind, int k, int dp[])
    {
        if(ind >= n)
            return 0;
        if(dp[ind] != -1)
            return dp[ind];
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for(int i=ind; i<n; i++){
            if(sum == 0 && sum + nums[i] > k)
                break;
            else if(sum != 0 && sum + nums[i] + 1 > k)
                break;
            if(sum == 0)
                sum += nums[i];
            else
                sum += nums[i] + 1;
            int temp = getMinCost(nums, n, i+1, k, dp);
            if(i < n-1 && temp != Integer.MAX_VALUE){
                temp = (int)Math.pow(k-sum, 2) + temp;
            }
            min = Math.min(min, temp);
        }
        dp[ind] = min;
        return dp[ind];
    }
    public int solveWordWrap (int[] nums, int k)
    {
        int n = nums.length;
        int dp[] = new int[n];
        Arrays.fill(dp, -1);
        int result = getMinCost(nums, n, 0, k, dp);
        return result;
    }
}