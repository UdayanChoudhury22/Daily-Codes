//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class DriverClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            int V = sc.nextInt();
            int E = sc.nextInt();
            for (int i = 0; i < V; i++)
                list.add(i, new ArrayList<Integer>());
            for (int i = 0; i < E; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();
                list.get(u).add(v);
            }
            if (new Solution().isCyclic(V, list) == true)
                System.out.println("1");
            else
                System.out.println("0");
        }
    }
}
// } Driver Code Ends


class Solution {
    // Function to detect cycle in a directed graph.
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        // code here
        int vis[]=new int[V];
        int recSt[]=new int[V];
        for(int i=0;i<V;i++){
            if(vis[i]==0)
            {
                if(cycle(adj,i,vis,recSt))
                return true;
            }
        }
        return false;
    }
    public static boolean cycle(ArrayList<ArrayList<Integer>> adj,int s,int []vis,int recSt[]){
            vis[s]=1;
            recSt[s]=1;
            for(int i=0;i<adj.get(s).size();i++){
                int x=adj.get(s).get(i);
                if(vis[x]==0){
                    if(cycle(adj,x,vis,recSt))return true;
                }else if(recSt[x]==1)return true;
            }
            recSt[s]=0;
        return false;
    }
}