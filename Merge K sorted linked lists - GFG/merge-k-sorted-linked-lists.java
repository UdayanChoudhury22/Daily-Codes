//{ Driver Code Starts
import java.util.*;

class Node
{
    int data;
    Node next;
    
    Node(int key)
    {
        data = key;
        next = null;
    }
}


class GfG
{
    public static void printList(Node node)
    {
        while(node != null)
        {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
    
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while(t-- > 0)
        {   
            int N = sc.nextInt();
            
            Node []a = new Node[N];
            
            for(int i = 0; i < N; i++)
            {
                int n = sc.nextInt();
                
                Node head = new Node(sc.nextInt());
                Node tail = head;
                
                for(int j=0; j<n-1; j++)
                {
                    tail.next = new Node(sc.nextInt());
                    tail = tail.next;
                }
                
                a[i] = head;
            }
            
            Solution g = new Solution();
             
            Node res = g.mergeKList(a,N);
            if(res!=null)
                printList(res);
            System.out.println();
        }
    }
}
// } Driver Code Ends


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

// a is an array of Nodes of the heads of linked lists
// and N is size of array a


class Solution
{
    //Function to merge K sorted linked list.
    Node mergeKList(Node[]arr,int K)
    {
        //Add your code here.
        PriorityQueue<Node> pq = new PriorityQueue<>((a, b) -> a.data - b.data);

        // Add the head nodes of linked lists to the priority queue
        for (int i = 0; i < K; i++) {
            if (arr[i] != null) {
                pq.offer(arr[i]);
            }
        }

        // Create a dummy node and initialize it as the head of the merged list
        Node dummy = new Node(0);
        Node tail = dummy;

        // Merge the linked lists
        while (!pq.isEmpty()) {
            // Remove the node with the smallest data value from the priority queue
            Node curr = pq.poll();

            // Attach the removed node to the next of the dummy node
            tail.next = curr;
            tail = tail.next;

            // If the removed node has a next node, add it to the priority queue
            if (curr.next != null) {
                pq.offer(curr.next);
            }
        }

        // Return the head of the merged linked list
        return dummy.next;
    }
}