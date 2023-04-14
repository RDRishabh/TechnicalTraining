import java.util.*;
public class swapping_nodes {
    public static class ListNode{
        int val;
        ListNode next;
        ListNode(){}
        ListNode(int data){
            this.val=data;
        }
        ListNode(int val, ListNode next){
            this.val=val;
            this.next=next;
        }
    }
    public static ListNode insertatend(ListNode l,int data){
        ListNode temp=new ListNode(data);
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
    public static int size(ListNode l){
        ListNode temp=l;
        int count=0;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        return count;
    }
    public static ListNode swapping(ListNode l,int k){
        int t=size(l);
        int data;
        ListNode temp=l;
        if(k==1){
            data=l.val;
            ListNode temp1=l;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp1.val=temp.val;
            temp.val=data;
        }
        else{
            
        }
        return l;
    }
}
