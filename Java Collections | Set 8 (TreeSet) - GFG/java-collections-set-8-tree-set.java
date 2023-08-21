//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.Scanner;
import java.util.TreeSet;

class gfg
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            TreeSet<String>ts=new TreeSet<>();
            int n=sc.nextInt();;
            for(int i=0;i<n;i++)
            {
                String s=sc.next();
                ts.add(s);
            }
            char a=sc.next().charAt(0);
            char b=sc.next().charAt(0);
            char c=sc.next().charAt(0);
            char d=sc.next().charAt(0);
            gfg1 obj=new gfg1();
            obj.task(ts,a,b,c,d);
        }
    }
}


// } Driver Code Ends
//User function Template for Java

class gfg1 {
    void task(TreeSet<String> ts, char a, char b, char c, char d) {
        // Printing strings less than 'a'
        System.out.print("[");
        String separator = "";
        for (String str : ts.headSet(String.valueOf(a))) {
            System.out.print(separator + str);
            separator = ", ";
        }
        System.out.println("]");

        // Printing strings greater than or equal to 'b'
        System.out.print("[");
        separator = "";
        for (String str : ts.tailSet(String.valueOf(b))) {
            System.out.print(separator + str);
            separator = ", ";
        }
        System.out.println("]");

        // Printing strings between 'c' and 'd' (excluding 'd')
        System.out.print("[");
        separator = "";
        for (String str : ts.subSet(String.valueOf(c), String.valueOf(d))) {
            System.out.print(separator + str);
            separator = ", ";
        }
        System.out.println("]");
    }
}

//{ Driver Code Starts.

// } Driver Code Ends