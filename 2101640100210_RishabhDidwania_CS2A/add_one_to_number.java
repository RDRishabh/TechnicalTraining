import java.util.*;
class add_one_to_number {
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
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp1=new ListNode();
        ListNode temp2=new ListNode();
        ListNode temp3=new ListNode();
        ListNode l3=new ListNode();
        //System.out.println("start"+l3.val);
        temp1=l1;
        temp2=l2;
        temp3=l3;
        int sum=0,s=0;
        while(temp1!=null && temp2!=null){
            sum=temp1.val + temp2.val + (int)(sum/10);
            s=sum%10;
            temp1=temp1.next;
            temp2=temp2.next;
            l3=insertatend(l3,s);
            // System.out.println(sum+" .1. "+s+" "+l3.val);
        }
        if(temp1!=null){
            while(temp1!=null){
                sum=temp1.val + (int)(sum/10);
                s=sum%10;
                temp1=temp1.next;
                l3=insertatend(l3,s);
                // System.out.println(sum+" .2. "+s+" "+l3.val);
            }
        }
        if(temp2!=null){
            while(temp2!=null){
                sum=temp2.val + (int)(sum/10);
                s=sum%10;
                temp2=temp2.next;
                l3=insertatend(l3,s);
                // System.out.println(sum+" .3. "+s+" "+l3.val);
            }
        }
        if((int)(sum/10)==1){
            s=(int)(sum/10);
            System.out.println(s);
            l3=insertatend(l3,s);
        }
        return temp3.next;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        ListNode temp1=new ListNode();
        ListNode l1=new ListNode();
        ListNode l2=new ListNode(1);
        ListNode l3=new ListNode();
        temp1=l1;
        // temp2=l2;
        System.out.println("Enter the number of nodes for list 1: ");
        int n1=sc.nextInt();    
        for(int i=0;i<n1;i++){
            System.out.println("Enter the data to be inputed: ");
            int n=sc.nextInt();
            l1=insertatend(l1, n);
        }
        l1=reverseList(temp1.next);
        l3=addTwoNumbers(l1,l2);
        display(reverseList(l3));
        sc.close();
    }
}
