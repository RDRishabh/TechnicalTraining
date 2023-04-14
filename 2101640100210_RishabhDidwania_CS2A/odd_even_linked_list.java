import java.util.*;
class odd_even_linked_list {
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
    // public static ListNode insertatbegin(ListNode l,int d){
    //     ListNode temp=new ListNode(d);
    //     if(l==null){
    //         l=temp;
    //         return l;
    //     }
    //     temp.next=l;
    //     l=temp;
    //     return l;
    // }
    public static void display(ListNode l){
        while(l!=null){
            System.out.print(l.val+" ");
            l=l.next;
        }
    }
    public static ListNode oddEvenList(ListNode head) {
        if(head == null) return head;
        ListNode root = head, tail = head, rootE = head.next, tailE = head.next;
        head = head.next != null ? head.next.next : null ;
        boolean isOdd = true;
        while(head != null){
            if(isOdd){
                tail.next = head;
                tail = tail.next;
            }else{
                tailE.next = head;
                tailE = tailE.next;
            }
            head = head.next;
            tail.next = tailE.next = null;
            isOdd = !isOdd;
        }
        tail.next = rootE;
        return root;
        
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        ListNode l1=new ListNode();
        System.out.println("Enter the number of nodes for list 1: ");
        int n1=sc.nextInt();
        for(int i=0;i<n1;i++){
            System.out.println("Enter the data to be inputed: ");
            int n=sc.nextInt();
            l1=insertatend(l1, n);
        }
        display(oddEvenList(l1));
        sc.close();
    }
}