//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            
            String S[] = read.readLine().split(" ");
            
            Long A = Long.parseLong(S[0]);
            Long B = Long.parseLong(S[1]);

            Solution ob = new Solution();

            System.out.println(ob.countCarry(A,B));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int countCarry(Long A , Long B){
        // code here
        String s1=Long.toString(A);
        String s2=Long.toString(B);
        int count=0;
        int carry=0;
        int i=s1.length();
        int j=s2.length();
        while(i!=0||j!=0){
            int x=0,y=0;
            if(i>0){
                x=s1.charAt(i-1)-'0';
                i--;
            }
            if(j>0){
                y=s2.charAt(j-1)-'0';
                j--;
            }
            int sum=carry+x+y;
            if(sum>=10){
                carry=1;
                count++;
            }
            else{
                carry=0;
            }
            
        }
        return count;
    }
};