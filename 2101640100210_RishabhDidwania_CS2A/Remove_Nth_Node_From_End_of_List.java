/**
 * Definition for singly-linked list.
 * 
 */
import java.util.*;
 class Remove_Nth_Node_From_End_of_List {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static ListNode insertatend(ListNode l,int d){
        ListNode temp1=new ListNode(d);
        if(l==null){
            l=temp1;
            return l;
        }
        while(l.next!=null){
            l=l.next;
        }
        temp1.next=null;
        l.next=temp1;
        return l;
    }
    public static void display(ListNode l){
        while(l!=null){
            System.out.print(l.val+" ");
            l=l.next;
        }
    }
    public static void deleteNode(ListNode node) {
        if(node==null) return;
        if(node.next==null){
            node = null;
            return;
        }
        node.val = node.next.val;
        node.next = node.next.next;
    }
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp1=head;
        int count=0;
        while(temp1!=null){
            temp1=temp1.next;
            count++;
        }
        // System.out.println(count);
        temp1=head;
        if(count==1 && n==1){
            head=null;
            return head;
        }
        if(n==1){
            while(temp1.next.next!=null){
                temp1=temp1.next;
            }
            temp1.next=null;
            //  display(head);
            return head;
        }
        temp1=head;
        for(int i=0;i<count-n;i++){
            temp1=temp1.next;
        }    
        deleteNode(temp1);
        System.out.println();
        // display(temp1);
        return head;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        ListNode l1=new ListNode();
        ListNode head=l1;
        System.out.println("Enter the number of elements in the Linked List");
        int n=sc.nextInt();
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++){
            int d=sc.nextInt();
            l1=insertatend(l1,d);
        }
        System.out.println("Enter the position for the end to be removed: ");
        int r=sc.nextInt();
        l1=removeNthFromEnd(head.next, r);
        display(l1);        
        sc.close();
    }
}