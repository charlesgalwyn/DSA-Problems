class Node{
	int data;
	Node next;

	Node(){
		this.data = 0;
		this.next = null;
	}
	Node(Node next,int data){
		this.data = data;
		this.next = next; 
	}
	Node(int data){
		this.data = data;
		this.next = null;
	}
}


class Solution{
    public int middleNode(Node head){
      //write your code here.
      if (head==null){
          return -1;
      }
      Node slow=head;
      Node fast=head;
      while (fast!=null && fast.next!=null){
          slow=slow.next;
          fast=fast.next.next;
      }
      return slow.data;
    }
  }
  
