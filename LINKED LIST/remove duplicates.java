
class Node{
  int data;
  Node next;
  public Node(int data){
    this.next = null;
    this.data = data;
  }
  public Node(int data, Node next){
    this.next = next;
    this.data = data;
  }
  public Node(){
    this.data = 0;
    this.next = null;
  }
}

class Solution{
    public Node removeDuplicates(Node a){
      Node curr=a;
      Node prev=a;
      while (curr!=null){
          if (prev.data!=curr.data){
              prev.next=curr;
              prev=curr;
          }
          curr=curr.next;
    }
    if (prev!=curr){
        prev.next=null;
    }
    return a;
  }
  }