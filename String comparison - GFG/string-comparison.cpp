//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;


int stringComparsion(string s1, string s2);


int main() 
{


   	ios_base::sync_with_stdio(0);
    cin.tie(NULL);
    cout.tie(NULL);
   
   	int t;
   	cin >> t;
   	while(t--)
   	{
   		string s1, s2;
   		cin >> s1 >> s2;

   		
   		cout << stringComparsion(s1, s2) << "\n";
   	}

    return 0;
}

// } Driver Code Ends



int stringComparsion(string s1,string s2)
{
    int m = s1.size();
    int n = s2.size();

    int i = 0, j = 0;
    
    while(i < m and j < n)
    {
		//If s1 and s2 have 'ng' at a common index
        if(i < m-1 and j < n-1 and s1[i] == 'n' and s1[i+1] == 'g' and s2[j] == 'n' and s2[j+1] == 'g')
        {
            i++;
            j++;
            continue;
        }

		//If s1 has 'ng'
        if(i < m-1 and s1[i] == 'n' and s1[i+1] == 'g')
        {
            i++;
       
            if(s2[j]>='o')
            	return -1;
            
            return 1;
        }

		//If s2 has 'ng'
        if(j < n-1 and s2[j] == 'n' and s2[j+1] == 'g')
        {
            j++;
            
            if(s1[i]>='o')
            	return 1;
            
            return -1;
        }

        if(s1[i] > s2[j])
        	return 1;
        
        else if(s1[i]<s2[j])
        	return -1;
        
        i++;
        j++;
    }

    
    if(i == m and j == n)
    	return 0;
    if(j < n)
        return -1;
    
    return 1;
}
 