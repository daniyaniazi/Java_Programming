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
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode oddIndicesNode= head;
        ListNode evenIndicesNode = head.next;
        ListNode current = evenIndicesNode;
        while(evenIndicesNode!=null &&evenIndicesNode.next!=null )
        {
            oddIndicesNode.next =oddIndicesNode.next.next;
            evenIndicesNode.next=evenIndicesNode.next.next;
            oddIndicesNode=oddIndicesNode.next;
            evenIndicesNode=evenIndicesNode.next;
        }
        oddIndicesNode.next = current;
        return head;
    }
}