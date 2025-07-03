//Problem:Given the head of a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list. Return the linked list sorted as well.
//Platform: Leetcode
//Link: https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/description/?envType=problem-list-v2&envId=linked-list
//Time Complexity: O(n)
//Space Complexity: O(1)


//Code Below

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy; 
        ListNode curr = head;  

        while (curr != null) {
            
            if (curr.next != null && curr.val == curr.next.val) {
                
                while (curr.next != null && curr.val == curr.next.val) {
                    curr = curr.next;
                }
                
                prev.next = curr.next;
            } else {
                
                prev = curr;
            }

            
            curr = curr.next;
        }

        return dummy.next;
    }
}
