//{ Driver Code Starts
// Initial Template for C++

#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends
// User function Template for C++

class Solution{
public:
    int maxValue(int A, int B){
        int maxi = INT_MIN;
        try{
            int p, q, r, k;
            p = A + B;
            q = A - B;
            r = A * B;
            if(B == 0)
                throw 0;
            k = A / B;
            maxi = max( maxi, max(p, max(q, max(r, k))));
        }
        catch(...){
            return -1*(999999);
        }
        return maxi;
    }
};

//{ Driver Code Starts.

int main(){
    int t;
    cin>>t;
    while(t--){
        int A,B;
        cin>>A>>B;
        
        Solution ob;
        int ans = ob.maxValue(A,B);
        if(ans == -999999)
            cout<<"inf\n";
        else
            cout<<ans<<"\n";
    }
    return 0;
}
// } Driver Code Ends