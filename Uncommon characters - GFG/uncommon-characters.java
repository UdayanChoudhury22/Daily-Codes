//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])throws IOException
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String A = sc.next();
                    String B = sc.next();
                    Solution ob = new Solution();
                    System.out.println(ob.UncommonChars(A, B));
                }
        }
}
// } Driver Code Ends


//User function Template for Java
class Solution
{
    String UncommonChars(String A, String B)
    {
        // code here
        int l1 = A.length();
        int l2 = B.length();
        ArrayList<String> lst = new ArrayList<>();
        for (int i = 0; i < l1; i++) {
            String s = String.valueOf(A.charAt(i));
            if (!B.contains(s)) {
                if (!lst.contains(s)) {
                    lst.add(s);
                }
            }
        }
        for (int i = 0; i < l2; i++) {
            String s = String.valueOf(B.charAt(i));
            if (!A.contains(s)) {
                if (!lst.contains(s)) {
                    lst.add(s);
                }
            }
        }
        if (lst.size() == 0) {
            return "-1";
        }
        Collections.sort(lst);
        StringBuilder res = new StringBuilder();
        for (String val : lst) {
            res.append(val);
        }
        return res.toString();
    }
}