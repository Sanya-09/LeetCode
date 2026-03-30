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
        ListNode t = head;
        ListNode h1 = new ListNode(0);
        ListNode t1 = h1;
        ListNode h2 = new ListNode(0);
        ListNode t2 = h2;
        int i = 1;
        while(t != null){
            if(i % 2 == 0){
                t1.next = new ListNode(t.val);
                t1 = t1.next;
            } else{
                t2.next = new ListNode(t.val);
                t2 = t2.next;
            } t = t.next;
            i++;
        }
        t2.next = h1.next;
        return h2.next;
    }
}