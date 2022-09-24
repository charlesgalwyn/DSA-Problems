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
    public static Node addAtHead(Node a,int data){
      //write your code here.
      Node new_node =new Node(data);
      new_node.next=a;
      a=new_node;
      return a;
    }
  }
