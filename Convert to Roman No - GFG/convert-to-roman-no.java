//{ Driver Code Starts
import java.util.Scanner;
import java.util.*;

class GFG
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int N = sc.nextInt();
			
			Solution ob = new Solution();
			System.out.println(ob.convertToRoman(N));
			t--;
		}
	}
}
// } Driver Code Ends


//User function template for JAVA



//User function template for JAVA

class Solution
{
	String convertToRoman(int n)
	{
		String strrom[][] = {{"","I","II","III","IV","V","VI","VII","VIII","IX"},
							   {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"},
							   {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"},
							   {"","M","MM","MMM","","","","","",""}};
		int i = 0;
		String str = "";
		while(n>0)
		{
			str = strrom[i][n%10]+str;
			n = n / 10;
			i++;
		}
		return str;
	}
}