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
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode p1=head;
        ListNode p2=head.next;
        
        head=head.next.next;
        p2.next=p1;
        p1.next=null;
        
        ListNode ans=swapPairs(head);
        p1.next=ans;
        return p2;
    }
}