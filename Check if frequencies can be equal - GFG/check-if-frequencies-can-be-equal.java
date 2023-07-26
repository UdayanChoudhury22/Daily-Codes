//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            
            String input[] = read.readLine().split(" ");
            String a = input[0];
            
            Solution ob = new Solution();
            if(ob.sameFreq(a)){
                System.out.println(1);
            }
            else{
                System.out.println(0);
            }
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    boolean allSame(HashMap<Character,Integer> hm)
    {
        HashSet<Integer> hs = new HashSet<Integer>(hm.values());
        
        return hs.size() == 1;
    }
    boolean sameFreq(String s) {
        // code here
        HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
        HashSet<Character> hs = new HashSet<Character>();
        int len = s.length();
        
        //put count of all characters in map
        for(int i=0;i<len;i++)
        {
            char c = s.charAt(i);
            if(!hm.containsKey(c))
            {
                hm.put(c,1);
                hs.add(c);
            }
            else
                hm.put(c,hm.get(c)+1);
        }
        
        //check if all values are same
        if(allSame(hm))
            return true;
        
        //iterate through all characters, reduce frequency by 1 and check equality of all values
        for(char c:hs)
        {
            hm.put(c,hm.get(c)-1);
            if(hm.get(c)==0)
                hm.remove(c);
            if(allSame(hm))
                return true;
            hm.put(c,hm.getOrDefault(c,0)+1);
        }
        return false;
    }
}