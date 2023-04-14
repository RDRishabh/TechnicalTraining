import java.util.*;
public class reverse_linked_list {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(){}
        ListNode(int val){ 
            this.val = val; 
        }
        ListNode(int val, ListNode next){ 
            this.val = val; 
            this.next = next; 
        }
    }
    public static ListNode insertatend(ListNode l,int d){
        ListNode temp=new ListNode(d);
        if(l==null){
            l=temp;
            return l;
        }
        while(l.next!=null){
            l=l.next;
        }
        temp.next=null;
        l.next=temp;
        return l;
    }
    public static void display(ListNode l){
        while(l!=null){
            System.out.print(l.val+" ");
            l=l.next;
        }
    }
    public static ListNode reverseList(ListNode head){
    
        ListNode start=head;
        ListNode prev=null;
        ListNode ptr=null;
        while(start!=null){
            ptr=start.next;
            start.next=prev;
            prev=start;
            start=ptr;
        }
        return prev;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        ListNode temp1=new ListNode();
        ListNode l1=new ListNode();
        ListNode l2=new ListNode();
        temp1=l1;
        System.out.println("Enter the number of nodes for list 1: ");
        int n1=sc.nextInt();
        for(int i=0;i<n1;i++){
            System.out.println("Enter the data to be inputed: ");
            int n=sc.nextInt();
            l1=insertatend(l1, n);
        }
        l2=reverseList(temp1.next);
        display(l2);
        sc.close();
    }
}
