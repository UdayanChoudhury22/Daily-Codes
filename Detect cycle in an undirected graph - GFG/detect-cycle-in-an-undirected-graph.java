//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int V = Integer.parseInt(s[0]);
            int E = Integer.parseInt(s[1]);
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            for (int i = 0; i < V; i++) adj.add(i, new ArrayList<Integer>());
            for (int i = 0; i < E; i++) {
                String[] S = br.readLine().trim().split(" ");
                int u = Integer.parseInt(S[0]);
                int v = Integer.parseInt(S[1]);
                adj.get(u).add(v);
                adj.get(v).add(u);
            }
            Solution obj = new Solution();
            boolean ans = obj.isCycle(V, adj);
            if (ans)
                System.out.println("1");
            else
                System.out.println("0");
        }
    }
}
// } Driver Code Ends


class Solution {
    // Function to detect cycle in an undirected graph.
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
         boolean[] v=new boolean[V];  
        for(int i=0;i<V;i++){
            if(v[i]==false){
                v[i]=true;
                if(detect(i,V,adj,v)==true)
                     return true;
            }
        }
        return false;
    }
    
    class pair{
        int node;
        int par;
        
        pair(int n,int p){
            this.node=n;
            this.par=p;
        }
        
    }
    
    public boolean detect(int i,int V,ArrayList<ArrayList<Integer>> adj,boolean[] v){
        Queue<pair> q=new LinkedList<>();
       
        q.add(new pair(i,-1));
       
    
        while(!q.isEmpty()){
             int p=q.peek().par;
             int node=q.peek().node;
             q.remove();
             for(int val:adj.get(node)){
                 if(v[val]==false){
                     v[val]=true;
                     q.add(new pair(val,node));
                 }
                 else if(p!=val){
                     return true;
                 }
             }
        }
        
   return false; }
}