//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] input = new String[2]; 
            input = br.readLine().split(" "); 
            int H = Integer.parseInt(input[0]); 
            int M = Integer.parseInt(input[1]); 
            Solution ob = new Solution();
            System.out.println(ob.timeToWord(H,M));
        }
    }
}

// } Driver Code Ends

class Solution
{
    public String timeToWord(int H, int M)
    {
        String[] str=new String[5];
        String[] num1={"one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve"};
        String[] num2={"eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
        String[] num3={"ten","twenty","thirty","fourty","fifty","sixty"};
        
        int[] s=new int[2];
        int m=M;
        int i=1,mm=0;
        if(M>30)
        {
            
            m=60-M;
            mm=m;
        }
        while(m>0)
        {
            
            int temp=m%10;
            s[i]=temp;
            m=m/10;
            i--;
        }
        String a="";
        String t="";
        if(M==0)
        {
            a=a+num1[H-1]+" o\' clock";
        }
        else if(M<=30 && M!=0)
        {
            if(M==15)
            {
                a=a+"quarter past "+num1[H-1];
            }
            else if(M==30)
            {
                a=a+"half past "+num1[H-1];
            }
            else
            {
                if(s[1]==0)
                {
                    t=t+num3[s[0]-1];
                }
                else if(M>10 && M<20)
                {
                    t=t+num2[s[1]-1];
                }
                else if(s[0]==0)
                {
                    t=t+num1[s[1]-1];
                }
                else if(M>20 && M<30)
                {
                    t=t+num3[s[0]-1]+" "+num1[s[1]-1];
                }
                if(M==1)
                    a=a+t+" minute past "+num1[H-1];
                else
                    a=a+t+" minutes past "+num1[H-1];
            }
        }
        else if(M>30 && M<60)
        {
            if(M==45)
            {
                a=a+"quarter to "+num1[H];
            }
            else
            {
            if(s[1]==0)
                {
                    t=t+num3[s[0]-1];
                }
                else if(mm>10 && mm<20)
                {
                    t=t+num2[s[1]-1];
                }
                else if(s[0]==0)
                {
                    t=t+num1[s[1]-1];
                }
                else if(mm>20 && mm<30)
                {
                    t=t+num3[s[0]-1]+" "+num1[s[1]-1];
                }
                if(mm==1)
                    a=a+t+" minute to "+num1[H];
                else    
                    a=a+t+" minutes to "+num1[H];
            }
        }
        
        return a;
    }
}