//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String s = in.readLine();
            int k = Integer.parseInt(in.readLine());
            
            Solution ob = new Solution();
            System.out.println(ob.minValue(s, k));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution{
    static int minValue(String s,int k){
        int freq[] = new int[26];
        for(int i = 0;i < s.length();i++)
			freq[s.charAt(i)-'a']++;
		PriorityQueue<Integer> p=new PriorityQueue(s.length(), new Comparator<Integer>(){
			public int compare(Integer i1,Integer i2){
				return i2-i1;
			}
		});
		for(int i = 0;i < 26;i++)
		    p.add(freq[i]);
	    while(k-- > 0){
		    int temp = p.peek();
		    p.poll();
		    temp = temp - 1;
		    p.add(temp);
		}
		int result = 0;
		while(!p.isEmpty()){
		    int x = p.peek();
		    result += (x*x);
		    p.poll();
		}
		return result;
    }
}