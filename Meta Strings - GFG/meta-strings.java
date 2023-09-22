//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0){
            String S1 = read.readLine().trim(); 
            String S2 = read.readLine().trim(); 
            Solution obj = new Solution();
            if(obj.metaStrings(S1, S2))
                System.out.println(1);
            else
                System.out.println(0);
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    boolean metaStrings(String S1, String S2) 
    { 
        // code here
        if(S1.equals(S2))
        {
            return false;
        }
        
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<S1.length();i++)
        {
            char ch = S1.charAt(i);
            if(map.containsKey(ch))
                map.put(ch,map.get(ch)+1);
            else
                map.put(ch,1);
        }
        
        
        for(int i=0;i<S2.length();i++)
        {
            char ch = S2.charAt(i);
            if(map.containsKey(ch))
            {
                if(map.get(ch) > 1)
                    map.put(ch,map.get(ch)-1);
                else
                    map.remove(ch);
            }
        }
        if(map.size() != 0)
            return false;
        
        int count = 0;
        for(int i=0;i<S1.length();i++)
        {
            if(S1.charAt(i) != S2.charAt(i))
                count++;
        }
        if(count > 2)
            return false;
        return true;
    }
} 


