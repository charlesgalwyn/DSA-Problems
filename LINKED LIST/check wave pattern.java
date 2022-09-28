/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class ListNode {
         int val;
         ListNode next;
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }

class Solution {
	
	public boolean checkWavePattern(ListNode head) {
		// Write your code here
		ListNode temp=head;
		int turn =0;
		if (temp.val<temp.next.val){
		    turn =1;
		}
		else {
		    turn =2;
		}
		while (temp.next!=null){
		    if (turn==1 && temp.val<temp.next.val){
		        temp=temp.next;
		        turn=2;
		    }
		    else if (turn ==2 && temp.val>temp.next.val){
		        temp=temp.next;
		        turn=1;
		    }
		    else {
		        return false ;
		    }
		}
		return true;
	}
}
