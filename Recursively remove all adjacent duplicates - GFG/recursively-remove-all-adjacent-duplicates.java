//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
        while(t-->0){
            String S = br.readLine();
            Solution ob = new Solution();
            String ans = ob.rremove(S).trim();
            if(ans.length() == 0)
                System.out.println();
            else
                System.out.println(ans);
        }
    }
}
// } Driver Code Ends



class Solution{
   String rremove(String s) {
        String s1 = "";
            while(s.length()!= s1.length()){
                s1 = s;
                s = rem(s);
            }
            return s;
            }
            
            
        public  String rem(String s){
       StringBuilder str = new StringBuilder();
      int n = s.length();
        int i =0;
      while(i<n){
          if(i<n-1 && s.charAt(i)==s.charAt(i+1)){
              while(i<n-1 && s.charAt(i)==s.charAt(i+1) ){
                  i++;
              }
          }
          else{
              str.append(s.charAt(i));
          }
          i++;
      }
      return str.toString();
     
      }
   }