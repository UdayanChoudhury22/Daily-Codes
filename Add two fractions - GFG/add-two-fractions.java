//{ Driver Code Starts
import java.util.*;

class Fraction_Addition
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0)
		{
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d = sc.nextInt();
			
			GfG g = new GfG();
			g.addFraction(a,b,c,d);
		T--;
		}
	}
}
// } Driver Code Ends


class GfG
{ 	
    void addFraction(int num1, int den1, int num2, int den2)
    {
        // Your code here	
        int num = num1*den2 + num2*den1;
        int den = den1*den2;
        int divisor = num;
        int divident = den;
        while (divisor>0)
        {
            int val=divisor; 
            divisor = divident%divisor;
            divident=val;
            
        }
        num/= divident; 
        den/= divident;
        System.out.println(num+"/"+den);
    }
}