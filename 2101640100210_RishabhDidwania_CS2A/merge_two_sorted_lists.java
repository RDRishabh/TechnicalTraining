/**
 * Definition for singly-linked list.
 * 
 */
import java.util.*;
 class merge_two_sorted_lists {
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
    // It will change the original linked list as well. 
    // public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    //     if(l1 == null) return l2;
	// 	if(l2 == null) return l1;
	// 	if(l1.val < l2.val){
	// 		l1.next = mergeTwoLists(l1.next, l2);
	// 		return l1;
	// 	} else{
	// 		l2.next = mergeTwoLists(l1, l2.next);
	// 		return l2;
	// 	}
    // }
    public static ListNode merge(ListNode l1,ListNode l2){
        ListNode l3=new ListNode();
        ListNode temp1=new ListNode();
        ListNode temp2=new ListNode();
        ListNode temp3=new ListNode();
        temp1=l1;
        temp2=l2;
        temp3=l3;
        int d=0;
        while(temp1!=null && temp2!=null){
            if(temp1.val<temp2.val){
                d=temp1.val;
                temp1=temp1.next;
            }
            else{
                d=temp2.val;
                temp2=temp2.next;
            }
            l3=insertatend(l3, d);
        }
        if(temp1!=null){
            while(temp1!=null){
                d=temp1.val;
                temp1=temp1.next;
            }
            l3=insertatend(l3, d);
        }
        if(temp2!=null){
            while(temp2!=null){
                d=temp2.val;
                temp2=temp2.next;
            }
            l3=insertatend(l3, d);
        }
        return temp3.next;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        ListNode temp1=new ListNode();
        ListNode temp2=new ListNode();
        ListNode l1=new ListNode();
        ListNode l2=new ListNode();
        // ListNode l3=new ListNode();
        ListNode l4=new ListNode();
        temp1=l1;
        temp2=l2;
        System.out.println("Enter the number of nodes for list 1: ");
        int n1=sc.nextInt();
        System.out.println("Enter the number of nodes for list 2: ");
        int n2=sc.nextInt();
        for(int i=0;i<n1;i++){
            System.out.println("Enter the data to be inputed: ");
            int n=sc.nextInt();
            l1=insertatend(l1, n);
        }
        for(int i=0;i<n2;i++){
            System.out.println("Enter the data to be inputed: ");
            int n=sc.nextInt();
            l2=insertatend(l2, n);
        }
        // display(temp1);
        // System.out.println();
        // display(temp2);
        // System.out.println();
        // l3=mergeTwoLists(temp1.next, temp2.next);
        // display(l3);
        // System.out.println();
        // display(temp1);
        // System.out.println();
        // display(temp2);
        // System.out.println();
        l4=merge(temp1.next,temp2.next);
        display(l4);
        sc.close();
    }
}