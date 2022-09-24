/*
class Node{
  int data;
  Node next;
  
  public Node(int data,Node next){
    this.data = data;
    this.next = next;
  }
  public Node(int data){
    this.data = data;
    this.next = null;
  }
  public Node(){
    this.data = 0;
    this.next = null;
  }
}
*/

class Solution{
    public static Node reverseLinkedList(Node a){
      //write your code here.
      Node curr=a;
      Node prev=null;
      Node next=null;
      while (curr!=null){
          next=curr.next;
          curr.next=prev;
          prev=curr;
          curr=next;
      }
      a=prev;
      return a;
    }
  }
