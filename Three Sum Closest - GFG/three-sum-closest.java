//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
        	int n = sc.nextInt();
        	int target = sc.nextInt();
        	int[] array = new int[n];
        	for(int i=0; i<n; i++)
        		array[i] = sc.nextInt();

            Solution ob = new Solution();
            System.out.println(ob.threeSumClosest(array,target));
            t--;
        }
    } 
} 

// } Driver Code Ends


//User function Template for Java

class Solution 
{ 
    static int threeSumClosest(int[] array, int target)  
	{ 
        // code here
        int n = array.length, maxsum = Integer.MAX_VALUE;
        Arrays.sort(array);
        
        for(int i = 0; i < n - 2; i++){
            int left = i+1, right = n -1;
            
            while(left < right){
                int sum = array[i] + array[left] + array[right];
                
                if(sum == target){
                    return sum;
                }
                
                if(Math.abs(target - sum) < Math.abs(target - maxsum)){
                    maxsum = sum;
                }
                
                if(Math.abs(target - sum) == Math.abs(target - maxsum)){
                    maxsum = Math.max(maxsum, sum);
                }
                
                if(sum > target){
                    right--;
                }else{
                    left++;
                }
                
            }
        }
        return maxsum;
	} 
} 