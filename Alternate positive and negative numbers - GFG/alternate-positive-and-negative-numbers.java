//{ Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            new Solution().rearrange(arr, n);
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java




class Solution {
    void rearrange(int arr[], int n) {
        // code here
        boolean needNeg=false;
        for(int i=0;i<n;i++){
            if(arr[i]>=0){
                //need pos
                if(needNeg==false){
                    needNeg=true;
                }else{
                    //find neg
                    int j=i+1;
                    while(j<n && arr[j]>=0){
                        j++;
                    }
                    if(j==n)return;
                    int ele=arr[j];
                    j--;
                    while(j>=i){
                        arr[j+1]=arr[j];
                        j--;
                    }
                    arr[i]=ele;
                    needNeg=false;
                }
            }else{
                //needed neg
                if(needNeg==true){
                    needNeg=false;
                }else{
                    //find pos
                    int j=i+1;
                    while(j<n && arr[j]<0){
                        j++;
                    }
                    if(j==n)return;
                    int ele=arr[j];
                    j--;
                    while(j>=i){
                        arr[j+1]=arr[j];
                        j--;
                    }
                    arr[i]=ele;
                    needNeg=true;
                }
            }
        }
    }
}