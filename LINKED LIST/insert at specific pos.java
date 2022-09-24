
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

class Solution{
    public static Node insertNodeAtPosition(Node a,int val,int pos){
      //write your code here.
      Node ptr=a;
      Node new_node=new Node(val);
      int index=0;
      if (pos==0){
          new_node.next=a;
          a=new_node;
          return a;
      }
      else{
      
      while (index<pos-1){
          ptr=ptr.next;
          index++;
      }
      new_node.next=ptr.next;
      ptr.next=new_node;
      
      return a;
    }
    }
}