//{ Driver Code Starts
// Initial template for Java
import java.util.*;
import java.io.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S1 = read.readLine();
            String S2 = read.readLine();
            Solution ob = new Solution();

            System.out.println(ob.areAnagram(S1, S2));
        }
    }
}
// } Driver Code Ends


// User function template for Java
class Solution {
    static int areAnagram(String S1, String S2) {
        // code here
        int n1 = S1.length();
        int n2 = S2.length();
        
        if(n1 != n2)
            return 0;
        else
        {
            HashMap<Character,Integer> map = new HashMap<>();
            HashMap<Character,Integer> map2 = new HashMap<>();
            for(int i=0;i<n1;i++)
            {
                char ch = S1.charAt(i);
                if(map.containsKey(ch))
                    map.put(ch,map.get(ch)+1);
                else
                    map.put(ch,1);
            }
            
            
            for(int i=0;i<n2;i++)
            {
                char ch1 = S2.charAt(i);
                if(map2.containsKey(ch1))
                    map2.put(ch1,map2.get(ch1)+1);
                else
                    map2.put(ch1,1);
            }
            
            if(map.equals(map2))
                return 1;
            else
                return 0;
        }
        
    }
}