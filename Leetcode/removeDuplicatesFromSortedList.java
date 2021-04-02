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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode temp1 = head;
        ListNode temp2 = head.next;
        while(temp1 != null && temp2 != null){
            if(temp1.val == temp2.val){
                temp1.next = temp2.next;
                temp2 = temp2.next;
            }
            else{
                temp1 = temp2;
                temp2 = temp2.next;
            }
        }
        return head;
    }
}