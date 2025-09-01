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

        ListNode mid=findMid(head);
        ListNode prev=null;
        ListNode curr=mid.next;
        ListNode next;
        mid.next=null;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        ListNode left=head;
        ListNode right=prev;
        ListNode newLeft,newRight;

        while(left!=null && right!=null){
            newLeft=left.next;
            left.next=right;
            newRight=right.next;
            right.next=newLeft;

        left=newLeft;
        right=newRight;

        }
        
    }
    public ListNode findMid(ListNode head){
        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}