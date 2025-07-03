//Problem: Given the head of a linked list, remove the nth node from the end of the list and return its head.
//Platform: LeetCode
//Link: https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/?envType=problem-list-v2&envId=linked-list
//Time Complexity: O(n)
//Space Complexity: O(1)


//Code Below

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow=head;
        ListNode fast=head;
        for(int i=0;i<n;i++){
            fast=fast.next;
        }
        if(fast==null){
            return head.next;
        }
        while(fast!=null && fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
        return head;
    }
}