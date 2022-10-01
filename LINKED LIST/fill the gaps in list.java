public class ListNode {
     int val;
     ListNode next;
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }


class Solution {

	public ListNode fillGaps(ListNode head) {
		// Write your code here
		if (head.next==null){
		    return head;
		}
		
		ListNode temp1=head;
		int num1= temp1.val;
		ListNode temp2=head;
		while (temp2.next!=null){
		    temp2=temp2.next;
		}
		int num2=temp2.val;
		temp1.next=temp2;
		for (int i=num1+1;i<num2;i++){
		
		insert(head,temp1,i);
		temp1=temp1.next;
		
		}
		
		return head;    
		
	}
    public ListNode insert(ListNode head,ListNode temp1,int num){
	    ListNode new_node=new ListNode(num);
		new_node.next=temp1.next;
		temp1.next=new_node;
		
		return head;
	}
}
