/*
class Node{
  int data;
  Node next;
  
  Node(int data,Node next){
    this.data = data;
    this.next = next;
  }
  Node(int data){
    this.data = data;
    this.next = null;
  }
  Node(){
    this.data = 0;
    this.next = null;
  }
}
*/

class Solution{
    public int nthNode(Node head,int n){
      //write your code here.
      if (head==null){
          return head.data;
      }
      Node p=head;
      Node q=head;
      for (int i=1;i<n && p!=null;i++){
          p=p.next;
      }
      if (p==null){
          return p.data;
      }
      else{
      while(p.next!=null){
          p=p.next;
          q=q.next;
      }
      return q.data;
  }
  }
}
