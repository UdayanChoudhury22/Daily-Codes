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
            String s = read.readLine();
            
            Solution ob = new Solution();
            String result = ob.removeVowels(s);
            
            System.out.println(result);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

// class Solution {
//     String removeVowels(String S) {
//         // code here
//       return S.replaceAll("[aeiou]","");
//     }
// }

class Solution {
    String removeVowels(String S) {
        StringBuilder sb = new StringBuilder();
        int i=0;
        while(i<S.length()) {
            char ch = S.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                i++;
            }else{
                sb.append(ch);
                i++;
            }
        }
        return sb.toString();
    }
}