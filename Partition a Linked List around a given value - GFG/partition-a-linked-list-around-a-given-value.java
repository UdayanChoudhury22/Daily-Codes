//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;
import java.lang.*;

class Node {
    int data;
    Node next;
    Node(int key) {
        data = key;
        next = null;
    }
}

class Partition {
    static Node head;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int a1 = sc.nextInt();
            Node head = new Node(a1);
            Node tail = head;
            for (int i = 1; i < n; i++) {
                int a = sc.nextInt();
                // addToTheLast(new Node(a));
                tail.next = new Node(a);
                tail = tail.next;
            }

            int k = sc.nextInt();
            Solution ob = new Solution();
            Node res = ob.partition(head, k);
            printList(res);
            System.out.println();
        }
    }

    public static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
}
// } Driver Code Ends


// User function Template for Java

/*class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

*/

// class Solution {
//     public static Node partition(Node head, int x) {
//         // Your code here
//         Node smaller_head = null;
//         Node equal_head = null;
//         Node greater_head = null;
        
        
//         Node smaller_temp  = null;
//         Node greater_temp = null;
//         Node equal_temp = null;
//         Node temp = head;
//         while(temp!=null)
//         {
//             if(temp.data < x)
//             {
//                 if(smaller_head == null)
//                 {
//                     smaller_head = new Node(temp.data);
//                     smaller_temp = smaller_head;
//                 }
//                 else
//                 {
//                     smaller_temp.next = new Node(temp.data);
//                     smaller_temp = smaller_temp.next;
//                 }
//                 temp = temp.next;
//             }
            
//             else if(temp.data > x)
//             {
//                 if(greater_head == null)
//                 {
//                     greater_head = new Node(temp.data);
//                     greater_head = greater_head;
//                 }
//                 else
//                 {
//                     greater_head.next = new Node(temp.data);
//                     greater_head = greater_head.next;
//                 }
//                 temp = temp.next;
//             }
            
//             else
//             {
//                 if(equal_head == null)
//                 {
//                     equal_head = new Node(temp.data);
//                     equal_head = equal_head;
//                 }
//                 else
//                 {
//                     equal_head.next = new Node(temp.data);
//                     equal_head = equal_head.next;
//                 }
//                 temp = temp.next;
//             }
//         }
        
//         temp = head;
//         while(smaller_head!=null)
//         {
//             temp.next = smaller_head;
//             temp = temp.next;
//             smaller_head = smaller_head.next;
//         }
        
//         while(equal_head != null)
//         {
//             temp.next = equal_head;
//             temp = temp.next;
//             equal_head = equal_head.next;
//         }
        
//         while(greater_head != null)
//         {
//             temp.next = greater_head;
//             temp = temp.next;
//             greater_head = greater_head.next;
//         }
//         return head;
        
//     }
// }









class Solution {
    public static Node partition(Node node, int x) {
        // Your code here
        Node dummy = new Node(-1);
        Node pt = dummy;
        Node curr = node;
        
        for(Node temp = node; temp != null; temp = temp.next){
            if(temp.data < x){
                Node n = new Node(temp.data);
                pt.next = n;
                pt = n;
            }
        }
        
        for(Node temp = node; temp != null; temp = temp.next){
            if(temp.data == x){
                Node n = new Node(temp.data);
                pt.next = n;
                pt = n;
            }
        }
        
        for(Node temp = node; temp != null; temp = temp.next){
            if(temp.data > x){
                Node n = new Node(temp.data);
                pt.next = n;
                pt = n;
            }
        }
        
        
        return dummy.next;
    }
}