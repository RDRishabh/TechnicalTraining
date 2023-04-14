import java.util.*;
public class delete_a_node {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(){}
        ListNode(int x) { 
            val = x; 
        }
    }
    public static void deleteNode(ListNode node) {
        if(node.next==null){
            node = null;
            return;
        }
        node.val = node.next.val;
        node.next = node.next.next;
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
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the Linked List: ");
        int n=sc.nextInt();
        ListNode l1=new ListNode();
        ListNode temp1=l1;
        ListNode temp2=l1;
        System.out.println("Enter the elements: ");
        for(int i=-0;i<n;i++){
            int s=sc.nextInt();
            l1=insertatend(l1, s);
        }
        System.out.println("Enter the position to be deleted: ");
        int p=sc.nextInt();
        if(p==(n-1)){
            while(temp1.next.next!=null){
                temp1=temp1.next;
            }
            temp1.next=null;
            display(temp2.next);
            sc.close();
            return;
        }
        temp1=temp1.next;
        for(int i=0;i<p;i++){
            temp1=temp1.next;
        }    
        deleteNode(temp1);
        display(temp2.next);
        sc.close();
        return;
    }
    
}
