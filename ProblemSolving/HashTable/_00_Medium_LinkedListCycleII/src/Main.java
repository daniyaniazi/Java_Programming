/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
// https://leetcode.com/problems/linked-list-cycle-ii/
public class Solution {
    public ListNode detectCycle(ListNode head) {
        HashSet<ListNode> nodes = new HashSet<>();
        ListNode current=head;
        while(current!=null){
            if(nodes.contains(current.next)) {return current.next;}
            nodes.add(current);
            current = current.next;
        }
        return null;
    }
}