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
        int maximum = Integer.MIN_VALUE;
        boolean flag = false;
        int num = 0;
        for(int i=0;i<S.length();i++)
        {
            if(Character.isDigit(S.charAt(i)))
            {
                num = num *10 + (S.charAt(i) - '0');
                flag = true;
            }
            else
            {
                maximum = Math.max(num,maximum);
                num = 0;
            }
        }
        if(flag)
            return Math.max(maximum,num);
        else
            return -1;
    }    
} 


// class Solution 
// { 
//     static int extractMaximum(String S) 
//     { 
//         int num = 0, res = 0, flag = 0; 
//         for (int i = 0; i<S.length(); i++) 
//         { 
//             // If a numeric value comes, start converting 
//             // it into an integer till there are consecutive 
//             // numeric digits 
//             if (Character.isDigit(S.charAt(i))) 
//             {
//                 num = num * 10 + (S.charAt(i)-'0'); 
//                 flag = 1;
//             }
//             else
//             { 
//                 res = Math.max(res, num); 
//                 num = 0; 
//             } 
//         } 
//         if (flag==1)
//             return Math.max(res, num); 
//         else
//             return -1;
//     }    
