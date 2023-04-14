/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        if(head==null || head.next==null){
            return;
        }
        ListNode ptr1=head,ptr2=head.next,ptr3,ptr4;
        while(ptr1.next!=null){
            if(ptr2==null || ptr2.next==null){
                break;
            }
            ptr4=ptr2.next;
            ptr3=ptr2;
            while(ptr4.next!=null){
                ptr3=ptr3.next;
                ptr4=ptr4.next;
            }
            ptr1.next=ptr4;
            ptr3.next=null;
            ptr1=ptr1.next;
            ptr1.next=ptr2;
            ptr1=ptr1.next;
            ptr2=ptr2.next;
        }
    }
}

//Link:- https://leetcode.com/problems/reorder-list/