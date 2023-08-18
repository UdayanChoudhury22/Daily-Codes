//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());

        while(t > 0){
            String S = sc.nextLine();
            Solution ob = new Solution();
            System.out.println(ob.extractMaximum(S)); 
            t--;
        }
    } 
} 



// } Driver Code Ends


//User function Template for Java

class Solution 
{ 
    static int extractMaximum(String S) 
    { 
        // code here
        int max = Integer.MIN_VALUE;
        int num=0;
        boolean flag = false;
        for(int i=0;i<S.length();i++)
        {
            char ch = S.charAt(i);
            if(Character.isAlphabetic(ch))
            {
                if(num > max)
                    max = num;
                
                num = 0;
            }
            else
            {
                num = num * 10 + (ch -'0'); 
                flag = true;
            }
        }
        if(num > max)
            max = num;
        if(flag == false)
           return -1;
        return max;
    }    
} 
