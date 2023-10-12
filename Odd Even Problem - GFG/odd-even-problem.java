//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();

            Solution ob = new Solution();
            System.out.println(ob.oddEven(S));
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution{
    static String oddEven(String S) {
        // code here
        int even=0,odd=0;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<S.length();i++)
        {
            char ch = S.charAt(i);
            if(map.containsKey(ch))
                map.put(ch,map.get(ch)+1);
            else
                map.put(ch,1);
        }
        
        
        for(Map.Entry<Character,Integer> val : map.entrySet())
        {
            int asc = (int)val.getKey();
            if(asc%2==0 && val.getValue()%2==0)
                even++;
            else if(asc%2 !=0 && val.getValue()%2 !=0)
                odd++;
        }
        
        if((even+odd)%2==0)
            return "EVEN";
        else
            return "ODD";
    }
}