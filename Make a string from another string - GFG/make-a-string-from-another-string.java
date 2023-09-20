//{ Driver Code Starts
//Initial Template for Java


import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args)throws IOException{
		
		//taking input using BufferedReader class
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//taking total count of testcases
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
		    //Reading the two Strings
		    String A = br.readLine();
		    String B = br.readLine();
		    
		    //Creating an object of class Rotate
		    Solution obj = new Solution();
		    
		    //calling areRotations method 
		    //of class Rotate and printing
		    //"1" if it returns true
		    //else "0"
		    if(obj.isPass(A,B))
		    {
		        System.out.println("1");
		    }
		    else
		    {
		        System.out.println("0");
		    }
		}
	}
}
// } Driver Code Ends


//User function Template for Java


class Solution{
    public static boolean isPass(String A, String B )
    {
        // Your code here
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<A.length();i++)
        {
            char ch = A.charAt(i);
            if(map.containsKey(ch))
                map.put(ch,map.get(ch)+1);
            else
                map.put(ch,1);
        }
        
        
        for(int i=0;i<B.length();i++)
        {
            char ch = B.charAt(i);
            if(map.containsKey(ch))
            {
                if(map.get(ch)==1)
                    map.remove(ch);
                else
                    map.put(ch,map.get(ch)-1);
            }
        }
        if(map.size() == 0)
            return true;
        else
            return false;
    }
    
}