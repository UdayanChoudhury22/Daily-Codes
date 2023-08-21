//{ Driver Code Starts
//Initial Template for Java
/*package whatever //do not write package name here */

import java.io.*;
import java.util.Scanner;

class GFG {
	public static void main (String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t-->0)
	    {
	        int a=sc.nextInt();
	        int b=sc.nextInt();
	        TestClass obj1=new TestClass(a,b);
	        obj1.findMin();
	    }
	}
}


// } Driver Code Ends
//User function Template for Java


class TestClass
{
    int a,b,Min;
    TestClass(int x,int y)
    {
        this.a=x;
        this.b=y;
        this.Min=Integer.MAX_VALUE;
    }
    public void findMin()
    {
        try{
            
        Min=Math.min(Min,a+b);
        Min=Math.min(Min,a-b);
        Min=Math.min(Min,a*b);
        Min=Math.min(Min,a/b);
        }
        catch(Exception e){
        }
        finally{
        System.out.println(Min);
        }
    }
}

//{ Driver Code Starts.

// } Driver Code Ends