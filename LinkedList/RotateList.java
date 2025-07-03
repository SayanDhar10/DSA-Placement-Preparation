//Problem: Given the head of a linked list, rotate the list to the right by k places.
//Platform: LeetCode
//Link: https://leetcode.com/problems/rotate-list/description/?envType=problem-list-v2&envId=linked-list
//Time Complexity: O(n)
//Space Complexity: O(1)


//Code Below

class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null){
            return head;
        }
        int length=1;
        ListNode temp=head;
        while(temp !=null && temp.next!=null){
            temp=temp.next;
            length++;
        }
        k=k%length;
        ListNode tail=head;
        if(k==0){
            return head;
        }
        for(int i=1;i<(length-k);i++){
            tail=tail.next;
            
        }
        ListNode newhead=tail.next;
        tail.next=null;
        temp.next=head;
        return newhead;
    }
}