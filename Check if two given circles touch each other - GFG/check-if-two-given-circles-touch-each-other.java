//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String[] S = read.readLine().split(" ");
            int X1 = Integer.parseInt(S[0]);
            int Y1 = Integer.parseInt(S[1]);
            int R1 = Integer.parseInt(S[2]);
            int X2 = Integer.parseInt(S[3]);
            int Y2 = Integer.parseInt(S[4]);
            int R2 = Integer.parseInt(S[5]);
            Solution ob = new Solution();
            System.out.println(ob.circleTouch(X1, Y1, R1, X2, Y2, R2));
        }
    }
}
// } Driver Code Ends



class Solution {
    int circleTouch(int X1, int Y1, int R1, int X2, int Y2, int R2) {
        // we are comparing squared values because sqrt leads to loss of
        // precision sometimes.
        int distanceBetweenCentresSquared =
            (X2 - X1) * (X2 - X1) + (Y2 - Y1) * (Y2 - Y1);
        int sumOfRadiiSquared = (R2 + R1) * (R2 + R1);
        return (distanceBetweenCentresSquared <= sumOfRadiiSquared ? 1 : 0);
    }
}